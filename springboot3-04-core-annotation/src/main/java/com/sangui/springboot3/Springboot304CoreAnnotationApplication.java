package com.sangui.springboot3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Date;

/**
 * @author sangui
 */
@SpringBootApplication
public class Springboot304CoreAnnotationApplication {

    @Bean
    public Date getDate(){
        return new Date();
    }

    public static void main(String[] args) {
        //SpringApplication.run(Springboot304CoreAnnotationApplication.class, args);
        ConfigurableApplicationContext applicationContext = SpringApplication.run(Springboot304CoreAnnotationApplication.class, args);

        // 通过bean的name获取bean
        Object sqlSessionFactory = applicationContext.getBean("sqlSessionFactory");
        System.out.println(sqlSessionFactory);

        Object transactionManager = applicationContext.getBean("transactionManager");
        System.out.println(transactionManager);


        applicationContext.close();
    }

}
