package com.pyo.blog.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserContorller {

    @GetMapping("/user/loginForm")
    public String loginForm(){
        return "user/loginForm";
    }

    @GetMapping("/user/joinForm")
    public String joinForm() {

        return "user/joinForm";
    }
}
