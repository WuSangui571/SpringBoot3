package com.sangui.lombok.test;


import com.sangui.lombok.service.UserService;

/**
 * @Author: sangui
 * @CreateTime: 2025-04-28
 * @Description: UserServiceTest
 * @Version: 1.0
 */
public class UserServiceTest {
    public static void main(String[] args) {
        UserService userService = new UserService();
        userService.saveUser();
    }
}
