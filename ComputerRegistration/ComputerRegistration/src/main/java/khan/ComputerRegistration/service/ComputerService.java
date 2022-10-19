package khan.ComputerRegistration.service;

import khan.ComputerRegistration.entity.Computer;
import khan.ComputerRegistration.repository.ComputersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.util.List;

@Service
public class ComputerService {

    @Autowired
    private ComputersRepo computersRepo;

    public List<Computer> getAllComputers() {
        //Connection conn = ;

        return computersRepo.findAll();
    }
}
