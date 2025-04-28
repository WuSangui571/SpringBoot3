package com.sangui.springboot;

import com.sangui.springboot.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Springboot311AopApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(Springboot311AopApplication.class, args);

        UserService userService = applicationContext.getBean(UserService.class);
        userService.save(11,"zhangsan");
        userService.deleteById(11);


        applicationContext.close();
    }

}
