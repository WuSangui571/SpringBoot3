package com.sangui.springboot.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: sangui
 * @CreateTime: 2025-04-25
 * @Description: ProfilesActiveConfig
 * @Version: 1.0
 */
@Configuration
public class ProfilesActiveConfig {
    @Value("${spring.datasource.username}")
    private String username;
    @Value("${spring.datasource.password}")
    private String password;
    @Value("${spring.datasource.url}")
    private String url;


    public void printInfo() {
        System.out.println(username+","+password+","+url);
    }
}
