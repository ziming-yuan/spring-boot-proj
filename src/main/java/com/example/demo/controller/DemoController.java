package com.example.demo.controller;

import com.example.demo.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @GetMapping("/hello")
    public String hello(@RequestParam(required = false) String name) {
        return "Hello " + name + "!";
    }

    @GetMapping("/user")
    public String user(User user) {
        return "Hello " + user.getName() + "! Your email is " + user.getEmail() + ".";
    }
}
