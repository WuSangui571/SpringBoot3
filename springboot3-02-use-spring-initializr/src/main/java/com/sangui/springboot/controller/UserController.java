package com.sangui.springboot.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: sangui
 * @CreateTime: 2025-04-24
 * @Description: 用户Controller
 * @Version: 1.0
 */
@RestController
public class UserController {
    @GetMapping("/index")
    public String index() {
        return "user system index page!";
    }
}
