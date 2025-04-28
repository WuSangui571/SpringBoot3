package com.sangui.springboot.service.impl;


import com.sangui.springboot.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @Author: sangui
 * @CreateTime: 2025-04-26
 * @Description: UserServiceImpl
 * @Version: 1.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Override
    public void save(int id, String name) {
        System.out.println(name + " is saving...");
    }

    @Override
    public void deleteById(int id) {
        System.out.println(id + " is deleted.");
    }
}
