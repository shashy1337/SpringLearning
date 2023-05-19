package ru.shashy.beanwebscopes.Processor;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;
import ru.shashy.beanwebscopes.Model.User;
import ru.shashy.beanwebscopes.Service.LoggedUserManagmentService;
import ru.shashy.beanwebscopes.Service.LoginCounterService;

@Component
@RequestScope
public class LoginProcessor {

    private final LoggedUserManagmentService loggedUserManagmentService;
    private final LoginCounterService loginCounterService;
    private User user;

    public LoginProcessor(
            LoggedUserManagmentService loggedUserManagmentService, LoginCounterService loginCounterService) {
        this.loggedUserManagmentService = loggedUserManagmentService;
        this.loginCounterService = loginCounterService;
    }

    public boolean login() {
        boolean logged = false;
        if ("Shashy".equals(user.getUsername()) && "0000".equals(user.getPassword())) {
            logged = true;
            loggedUserManagmentService.setUsername(user.getUsername());
            loginCounterService.increment();
        }
        return logged;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }
}
