package com.project.java_spring_laptopshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude =
org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class)

public class JavaSpringLaptopshopApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaSpringLaptopshopApplication.class, args);
	}

}
