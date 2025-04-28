package com.sangui.springboot.bean;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @Author: sangui
 * @CreateTime: 2025-04-25
 * @Description: user
 * @Version: 1.0
 */
//@Configuration
@ConfigurationProperties(prefix = "app.xyz")
public class User {
    private String name;
    private Address address;

    @Override
    public String toString() {
        return "user{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    public User() {
    }

    public User(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
