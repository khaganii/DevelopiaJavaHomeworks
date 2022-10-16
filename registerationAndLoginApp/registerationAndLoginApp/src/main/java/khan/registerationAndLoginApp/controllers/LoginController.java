package khan.registerationAndLoginApp.controllers;

import khan.registerationAndLoginApp.entity.Login;
import khan.registerationAndLoginApp.service.LoginService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/api/v1")
public class LoginController {
    private LoginService loginService = new LoginService();

    @GetMapping("/login")
    public String getLoginPage(){
        return "login";
    }

    @PostMapping("/login-check")
    public String check(@RequestParam Login loginInfo){
        return loginService.checkPassword(loginInfo);
    }
}
