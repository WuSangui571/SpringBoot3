package com.sangui.springboot;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 三桂
 * @CreateTime: 2025-04-24
 * @Description: 我的Controller
 * @Version: 1.0
 */
@RestController
public class MyController {
    @GetMapping("/my")
    public String index() {
        return "My Controller!";
    }
}
