package ru.shashy.fileexchangerspring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.shashy.fileexchangerspring.service.UserService;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private UserService userService;


    @GetMapping
    public String getAdmin(Model model){
        model.addAttribute("UserRegistry", userService.findAll());
        return "AdminForm";
    }

    @PostMapping
    public String deleteUser(
            @RequestParam Long userId,
            @RequestParam String action,
            Model model
    ){
        if (action.equals("delete")) userService.deleteUser(userId);
        model.addAttribute("UserRegistry", userService.findAll());
        return "AdminForm";
    }

    @GetMapping("/admin/gt/{userId}")
    public String gtUser(@PathVariable("userId") Long userId, Model model){
        model.addAttribute("UserRegistry", userService.usergtList(userId));
        return "AdminForm";
    }

}
