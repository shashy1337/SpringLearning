package ru.shashy.beanwebscopes.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.shashy.beanwebscopes.Service.LoggedUserManagmentService;
import ru.shashy.beanwebscopes.Service.LoginCounterService;

@Controller
public class WelocmeController {

    private final LoggedUserManagmentService loggedUserManagmentService;
    private final LoginCounterService loginCounterService;

    public WelocmeController(LoggedUserManagmentService loggedUserManagmentService,
                             LoginCounterService loginCounterService){
        this.loggedUserManagmentService = loggedUserManagmentService;
        this.loginCounterService = loginCounterService;
    }
    @GetMapping("/welcome")
    public String welcomeGet(Model model, @RequestParam(required = false) String Logout){
        String username = loggedUserManagmentService.getUsername();
        int counter = loginCounterService.getCount();
        if (Logout != null){
            loggedUserManagmentService.setUsername(null);
            return "redirect:/";
        }

        if (username == null){
            return "redirect:/";
        }
        model.addAttribute("username", username);
        model.addAttribute("counter", counter);

        return "welcome.html";
    }
}
