package com.example.DHIS2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("links", new String[]{
                "https://hiskenya.org",
                "https://test.hiskenya.org",
                "https://histracker.health.go.ke",
                "https://kmhfl.health.go.ke"
        });
        return "home";
    }
}
