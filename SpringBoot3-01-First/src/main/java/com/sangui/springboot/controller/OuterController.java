package com.sangui.springboot.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 三桂
 * @CreateTime: 2025-04-24
 * @Description: 外部Controller,测试行不行
 * @Version: 1.0
 */
@RestController
public class OuterController {
    @GetMapping("/out")
    public String outMethod() {
        return "Outer Controller!";
    }
}
