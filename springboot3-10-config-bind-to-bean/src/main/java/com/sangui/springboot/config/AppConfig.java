package com.sangui.springboot.config;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @Author: sangui
 * @CreateTime: 2025-04-25
 * @Description: AppConfig
 * @Version: 1.0
 */
// 纳入IoC容器的管理。
@Component
// 将配置文件中的属性值一次性的绑定到bean对象上。
@ConfigurationProperties(prefix = "myapp.a")
public class AppConfig {
    // 名字一定要一致，且一定要设置setter方法
    private String username;
    private String password;
    private Integer age;
    private boolean gender;

    @Override
    public String toString() {
        return "AppConfig{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

}
