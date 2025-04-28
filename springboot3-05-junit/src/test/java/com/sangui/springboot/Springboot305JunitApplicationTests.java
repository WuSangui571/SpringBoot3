package com.sangui.springboot;

import com.sangui.springboot.bean.User;
import com.sangui.springboot.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot305JunitApplicationTests {
    @Autowired
    UserService userService;

    @Test
    void test01() {
        User user = userService.findUser();
        System.out.println(user);
    }
}
