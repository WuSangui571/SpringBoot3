package com.sangui.springboot.config;


import com.sangui.springboot.bean.Address;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: sangui
 * @CreateTime: 2025-04-25
 * @Description: AppConfig2
 * @Version: 1.0
 */
@Configuration
public class AppConfig2 {
    @Bean
    @ConfigurationProperties(prefix = "other.abc")
    public Address getAddress(){
        return new Address();
    }
}
