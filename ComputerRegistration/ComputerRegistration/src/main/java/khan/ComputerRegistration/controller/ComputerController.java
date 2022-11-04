package khan.ComputerRegistration.controller;

import khan.ComputerRegistration.dto.ComputerDto;
import khan.ComputerRegistration.entity.Computer;
import khan.ComputerRegistration.service.ComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/computers")
public class ComputerController {

    @Autowired
    private ComputerService computerService;

    @GetMapping("/list")
    public String computerList(Model model){
        List<Computer> computers = computerService.getAllComputers();
        System.out.println(computers.toString());
        model.addAttribute("computers", computers);
        return "computers";
    }

    @GetMapping("/save-page")
    public String showSavePage(Model model){
        ComputerDto computerDto = new ComputerDto();
        model.addAttribute("computerData", computerDto);
        return "computer_save";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Integer id){
        computerService.delete(id);
        return "redirect:/computers/list";
    }


    @PostMapping("/save-computer")
    public String saveComputer(@ModelAttribute(name = "computerData")ComputerDto computerDto){
        computerService.save(computerDto);
        return "computer_save";
    }

}
