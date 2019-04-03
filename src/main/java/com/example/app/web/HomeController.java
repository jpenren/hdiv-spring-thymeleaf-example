package com.example.app.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    
    public HomeController() {
        // TODO Auto-generated constructor stub
        System.out.println("");
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }
    
}
