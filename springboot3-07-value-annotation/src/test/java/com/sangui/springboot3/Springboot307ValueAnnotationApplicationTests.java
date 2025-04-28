package com.sangui.springboot3;

import com.sangui.springboot3.service.SystemService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot307ValueAnnotationApplicationTests {
    @Autowired
    private SystemService systemService;

    @Test
    void test01() {
        systemService.printInfo();
    }

}
