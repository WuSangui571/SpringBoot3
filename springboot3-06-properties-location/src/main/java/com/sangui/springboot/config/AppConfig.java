package com.sangui.springboot.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @Author: sangui
 * @CreateTime: 2025-04-24
 * @Description: AppConfig
 * @Version: 1.0
 */
// 纳入IoC容器的管理
@Configuration
// @Component
public class AppConfig {
    @Value("${myapp.path}")
    private String appPath;
    public void printInfo(){
        System.out.println(appPath);
    }
}
