package com.meghasys.learning.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/home")
    public String getHome(){
        return "Welcome to Home!!";
    }

    @GetMapping("/user/home")
    public String getUserHome(){
        return "Welcome to User Home!!";
    }

    @GetMapping("/admin/home")
    public String getAdminHome(){
        return "Welcome to Admin Home!!";
    }
}
