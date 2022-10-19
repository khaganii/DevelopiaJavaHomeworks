package khan.ComputerRegistration.controller;

import khan.ComputerRegistration.service.ComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/computers")
public class ComputerController {

    @Autowired
    private ComputerService computerService;

    @GetMapping("/list")
    public String computerList(Model model){
        model.addAttribute("computers", computerService.getAllComputers());
        return "students";
    }

    @GetMapping("/save-page")
    public String showSavePage(Model model){
        return "save";
    }

//    @PostMapping("/save-computer")
//    public String

}
