package com.sangui.springboot.service;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @Author: sangui
 * @CreateTime: 2025-04-25
 * @Description: SystemService
 * @Version: 1.0
 */
@Service
public class SystemService {
    @Value("${myapp.username}")
    private String username;
    @Value("${myapp.email}")
    private String email;
    @Value("${myapp.age}")
    private Integer age;
    @Value("${myapp.gender}")
    private boolean gender;

    public void printInfo() {
        System.out.println(username);
        System.out.println(email);
        System.out.println(age);
        System.out.println(gender);
    }
}
