package khan.ComputerRegistration.repository;

import khan.ComputerRegistration.dto.ComputerDto;
import khan.ComputerRegistration.entity.Computer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ComputersRepo {


    @Autowired
    private DataSource dataSource;
    public List<Computer> findAll() {
        List<Computer> computers = new ArrayList<>();
        try {
            Connection con = dataSource.getConnection();
            PreparedStatement prs = con.prepareStatement("Select * from computers;");
            ResultSet rs = prs.executeQuery();
            while (rs.next()){
                Computer computer = new Computer();
                computer.setId(rs.getInt(1));
                computer.setName(rs.getString(2));
                computer.setSort(rs.getString(3));
                computer.setRam(rs.getInt(4));
                computer.setMemory(rs.getInt(5));
                computer.setRamType(rs.getString(6));
                computers.add(computer);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return computers;
    }

    public String save(ComputerDto computerDto) {
        try {
            Connection con = dataSource.getConnection();
            PreparedStatement prs = con.prepareStatement("Insert into computers (name, sort, ram, memory, ramType) values (?, ?, ?, ?, ?)");
            prs.setString(1, computerDto.getName());
            prs.setString(2, computerDto.getSort());
            prs.setInt(3, computerDto.getRam());
            prs.setInt(4, computerDto.getMemory());
            prs.setString(5, computerDto.getRamType());
            prs.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return "computers";
    }

    public void delete(Integer id) {
        try {
            Connection con = dataSource.getConnection();
            PreparedStatement prs = con.prepareStatement("delete from computers where id=?");
            prs.setInt(1, id);
            System.out.println(id);
            prs.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
