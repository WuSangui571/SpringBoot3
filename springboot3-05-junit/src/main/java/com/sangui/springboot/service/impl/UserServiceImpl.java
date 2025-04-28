package com.sangui.springboot.service.impl;


import com.sangui.springboot.bean.User;
import com.sangui.springboot.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @Author: sangui
 * @CreateTime: 2025-04-24
 * @Description: UserServiceImpl
 * @Version: 1.0
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Override
    public User findUser() {
        return new User("jackson","333");
    }
}
