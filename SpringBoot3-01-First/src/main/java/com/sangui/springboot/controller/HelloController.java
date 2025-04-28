package com.sangui.springboot.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: sangui
 * @CreateTime: 2025-04-21
 * @Description: 控制器，这个控制器必须在主入口程序的同级目录下或子目录下，其他目录不行。
 * @Version: 1.0
 */
//@Controller
@RestController
public class HelloController {

    @GetMapping("/hello")
    //@ResponseBody
    public String hello() {
        return "Hello,SpringBoot3!";
    }
}
