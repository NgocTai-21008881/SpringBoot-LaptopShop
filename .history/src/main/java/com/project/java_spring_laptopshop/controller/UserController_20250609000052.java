package com.project.java_spring_laptopshop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.java_spring_laptopshop.service.UserService;


// Các giải thích thì dùng tiếng việt giúp mình nhé. thanks
@RestController
public class UserController {
    
    private final UserService userService;

    
    public UserController(UserService userService) {
        this.userService = userService;
    }



    @GetMapping("")
    public String getHomePage() {
        return this.userService.handleHello();
    }
    
}
