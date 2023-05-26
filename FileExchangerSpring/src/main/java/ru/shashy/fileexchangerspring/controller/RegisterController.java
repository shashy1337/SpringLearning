package ru.shashy.fileexchangerspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.shashy.fileexchangerspring.entity.UserRegistry;
import ru.shashy.fileexchangerspring.service.UserService;

import java.util.logging.Logger;

@Controller
@RequestMapping("/register")
public class RegisterController {

    private final UserService userService;
    Logger logger = Logger.getLogger(RegisterController.class.getName());

    public RegisterController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String getRegisterForm() {
        return "RegistrationForm";
    }

    @PostMapping
    public String postRegister(UserRegistry userRegistry, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "RegistrationForm";
        }
        if (!userService.saveUser(userRegistry)) {
            model.addAttribute("message", "Пользователь с таким именем уже существует");
            return "RegistrationForm";
        }

        userService.saveUser(userRegistry);
        model.addAttribute("message", "Вы зарегистрировались");

        return "RegistrationForm";
    }
}
