package com.example.demo;
import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("message", "Hello, World!!!");
        System.out.println("GET /");
        return "home";
    }

    @GetMapping("/thb")
    public String home2(Model model) {
        model.addAttribute("message", "THB!!!");
        System.out.println("GET /thb");
        return "home";
    }

    @PostMapping("/thb")
    public String home2post(Model model) {
        model.addAttribute("message", "THB!!!");
        System.out.println("POST /thb");
        return "home";
    }
}