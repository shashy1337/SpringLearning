package ru.shashy.beanwebscopes.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.shashy.beanwebscopes.Model.User;
import ru.shashy.beanwebscopes.Processor.LoginProcessor;

@Controller
public class LoginController {

    private final LoginProcessor loginProcessor;

    public LoginController(LoginProcessor loginProcessor) {
        this.loginProcessor = loginProcessor;

    }
    @GetMapping("/")
    public String getLogin() {
        return "login.html";
    }
    @PostMapping("/")
    public String loggedIn(
            Model model,
            User user
    ) {
        loginProcessor.setUser(user);
        boolean logIn = loginProcessor.login();
        if (logIn) {
            return "redirect:/welcome";
        }
        model.addAttribute("message", "Log failed");
        return "login.html";
    }
}
