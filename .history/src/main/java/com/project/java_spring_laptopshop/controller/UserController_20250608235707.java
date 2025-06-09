package com.project.java_spring_laptopshop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


// Các giải thích thì dùng tiếng việt giúp mình nhé. thanks
@RestController
public class UserController {
    
    @GetMapping("path")
    public String getMethodName(@RequestParam String param) {
        return "Hello from controller !";
    }
    
}
