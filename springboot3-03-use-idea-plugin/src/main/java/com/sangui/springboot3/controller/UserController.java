package com.sangui.springboot3.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: sangui
 * @CreateTime: 2025-04-24
 * @Description: UserController
 * @Version: 1.0
 */
@RestController
public class UserController {
    @GetMapping("/hello")
    public String hello(){
        return "Hello World";
    }
}
