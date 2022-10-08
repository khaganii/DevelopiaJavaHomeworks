package az.khan.spring_mvc_practice2.controller;

import az.khan.spring_mvc_practice2.db_connection.ConnectToDb;
import az.khan.spring_mvc_practice2.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentController {

    @GetMapping(path = "/students")
    public String showPage(Model model) throws SQLException {
        List<Student> studentList = new ArrayList<>();
        Connection con = ConnectToDb.getConnection();
        PreparedStatement ps = con.prepareStatement("Select c.customer_id, first_name, last_name,city " +
                "from customer as c " +
                "left join address as ad on c.address_id = ad.address_id " +
                "left join city on ad.city_id = city.city_id limit 50;");
        ResultSet rs = ps.executeQuery();
        while (rs.next()){
            Student student = new Student();
            student.setId(rs.getInt(1));
            student.setName(rs.getString(2));
            student.setSurname(rs.getString(3));
            student.setCity(rs.getString(4));
            studentList.add(student);
        }
        model.addAttribute("studentList", studentList);
        return "students";
    }

    @GetMapping(path = "/studentDetails/{id}")
    public String showDetailPage(Model model, @PathVariable int id) throws SQLException {
        Connection con = ConnectToDb.getConnection();
        PreparedStatement ps = con.prepareStatement("Select c.customer_id, first_name, last_name,city " +
                "from customer as c " +
                "left join address as ad on c.address_id = ad.address_id " +
                "left join city on ad.city_id = city.city_id where c.customer_id = ?;");
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        Student student = new Student();
        while (rs.next()) {
            student.setId(rs.getInt(1));
            student.setName(rs.getString(2));
            student.setSurname(rs.getString(3));
            student.setCity(rs.getString(4));
        }
        model.addAttribute("student", student);
        return "studentDetails";
    }
}
