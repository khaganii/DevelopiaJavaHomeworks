package khan.registerationAndLoginApp.controllers;

import khan.registerationAndLoginApp.entity.Registration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1")
public class RegistrationController {

    @GetMapping("/registration")
    public String getRegistrationPage(Model model){
        Registration reg = new Registration();
        model.addAttribute("reg", reg);
        return "registration";
    }

    @PostMapping("/save-user")
    public String saveUser(@ModelAttribute(name = "reg") Registration registration){
        System.out.println(registration.getName());
        return "registration";
    }

}
