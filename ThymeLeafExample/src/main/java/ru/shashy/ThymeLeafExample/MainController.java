package ru.shashy.ThymeLeafExample;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @RequestMapping("/home")
    public String getHome(
            @RequestParam(required = false) String color,
            @RequestParam(required = false) String username,
            Model page){
        page.addAttribute("username", username);
        page.addAttribute("color", color);
        return "home.html";
    }
}