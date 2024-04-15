package com.example.demo.controller;

import com.example.demo.entity.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @GetMapping("/user/{id}")
    public String getUser(@PathVariable int id) {
        return "User ID: " + id;
    }
    @PutMapping("/user/")
    public String updateUser(User user) {
        return "User updated";
    }

    @DeleteMapping("/user/{id}")
    public String deleteUser(@PathVariable int id) {
        return "User deleted: " + id;
    }

    @PostMapping("/user/")
    public String createUser(User user) {
        return "User created";
    }
}
