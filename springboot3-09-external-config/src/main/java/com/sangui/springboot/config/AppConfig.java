package com.sangui.springboot.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @Author: sangui
 * @CreateTime: 2025-04-25
 * @Description: AppConfig
 * @Version: 1.0
 */
@Configuration
public class AppConfig {
    @Value("${spring.datasource.username}")
    private String mysqlUsername;
    @Value("${spring.datasource.password}")
    private String mysqlPassword;
    @Value("${spring.data.redis.host}")
    private String redisHost;
    @Value("${spring.data.redis.port}")
    private Integer redisPort;

    public void printInfo() {
        System.out.println(mysqlUsername+ ","+mysqlPassword+","+redisHost+","+redisPort);
    }


}
