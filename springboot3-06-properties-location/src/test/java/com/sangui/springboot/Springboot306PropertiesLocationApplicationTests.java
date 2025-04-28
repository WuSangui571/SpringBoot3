package com.sangui.springboot;

import com.sangui.springboot.config.AppConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;

@SpringBootTest
class Springboot306PropertiesLocationApplicationTests {
    @Autowired
    private AppConfig appConfig;
    @Test
    void test01() {
        appConfig.printInfo();
    }

}
