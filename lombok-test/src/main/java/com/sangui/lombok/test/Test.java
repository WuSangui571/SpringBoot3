package com.sangui.lombok.test;


import com.sangui.lombok.bean.User;

/**
 * @Author: sangui
 * @CreateTime: 2025-04-27
 * @Description: Test
 * @Version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        User user1 = new User();
        user1.setId(111L);
        user1.setName("jack");
        user1.setAge(22);
        System.out.println(user1);

        User user2 = new User(222L,"tom",33);
        System.out.println(user2);

    }
}
