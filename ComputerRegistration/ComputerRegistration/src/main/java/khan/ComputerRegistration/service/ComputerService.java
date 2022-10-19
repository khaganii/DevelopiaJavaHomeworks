package khan.ComputerRegistration.service;

import khan.ComputerRegistration.dto.ComputerDto;
import khan.ComputerRegistration.entity.Computer;
import khan.ComputerRegistration.repository.ComputersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComputerService {

    @Autowired
    private ComputersRepo computersRepo;

    public List<Computer> getAllComputers() {
        return computersRepo.findAll();
    }

    public String save(ComputerDto computerDto) {
        return computersRepo.save(computerDto);
    }

    public void delete(Integer id) {
        computersRepo.delete(id);
    }
}
