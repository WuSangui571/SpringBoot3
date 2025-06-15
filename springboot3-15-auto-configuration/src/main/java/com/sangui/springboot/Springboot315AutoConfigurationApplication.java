package com.sangui.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Springboot315AutoConfigurationApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(Springboot315AutoConfigurationApplication.class, args);

        // 从 IoC 容器中查看有多少个组件，将组件的 Id 打印出来
        String[] allBeanNames = applicationContext.getBeanDefinitionNames();
        for (String beanName : allBeanNames) {
            if ("a".equals(beanName)) {
                System.out.println(beanName);
            }
            if ("b".equals(beanName)) {
                System.out.println(beanName);
            }
        }
        System.out.println("bean length:" + allBeanNames.length);

        applicationContext.close();
    }
}
