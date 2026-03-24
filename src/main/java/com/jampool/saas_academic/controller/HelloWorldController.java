package com.jampool.saas_academic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, Bobby! Spring Boot with Java 17 is ready!";
    }
}
