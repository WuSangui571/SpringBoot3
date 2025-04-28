package com.sangui.springboot.bean;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * @Author: sangui
 * @CreateTime: 2025-04-26
 * @Description: v
 * @Version: 1.0
 */
@Component
public class SomeBean {
    @Autowired
    private Environment environment;

    public void doSomething() {
        String[] activeProfiles = environment.getActiveProfiles();
        for (String activeProfile : activeProfiles) {
            System.out.println(activeProfile);
        }

        // 获取配置信息
        String street = environment.getProperty("app.xyz.address.street");
        System.out.println(street);
    }
}
