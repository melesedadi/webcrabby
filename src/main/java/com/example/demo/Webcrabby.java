package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Webcrabby {
    @RequestMapping("/")
    public String home() {
        return "home";
    }

    @RequestMapping("/about")
    public String about() {
        return "about";

    }

    @RequestMapping("/recipes")

    public String recipes() {
        return "recipes";

    }
    @RequestMapping("/contact")

    public String contact() {
        return "contact";

    }
}

