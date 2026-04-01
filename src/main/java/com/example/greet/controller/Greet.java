package com.example.greet.controller;

import org.springframework.stereotype.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class Greet {

    @GetMapping("/")
    public String greet() {
        return "greet.html";
    }
    
}
