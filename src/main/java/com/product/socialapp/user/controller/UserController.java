package com.product.socialapp.user.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")  // API endpoint for user operations. For example, /api/user/login, /api/user/register, etc.
public class UserController {


    @PostMapping("/v1/create")
    public String createUser() {
        // Code to create a new user
        return "User created successfully!";
    }
}
