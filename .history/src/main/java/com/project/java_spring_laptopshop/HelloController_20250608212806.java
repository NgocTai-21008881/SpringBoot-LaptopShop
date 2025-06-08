package com.project.java_spring_laptopshop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
@GetMapping("/")
    public String index() {
        return "Hello Nguyễn Ngọc Tài";
    }
}
