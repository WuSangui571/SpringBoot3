package com.sangui.springboot;

import com.sangui.springboot.service.SystemService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot308YmlNewApplicationTests {
    @Autowired
    SystemService service;
    @Test
    void test01() {
        service.printInfo();
    }

}
