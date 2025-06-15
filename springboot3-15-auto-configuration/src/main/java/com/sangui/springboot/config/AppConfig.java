package com.sangui.springboot.config;


import com.sangui.springboot.bean.A;
import com.sangui.springboot.bean.B;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @Author: sangui
 * @CreateTime: 2025-06-15
 * @Description:
 * @Version: 1.0
 */
// 在类路径中存在 DispatcherServlet 这个类的时候，执行下面(即配置生效)
@ConditionalOnClass(name = "org.springframework.web.servlet.DispatcherServlet")
@Configuration
public class AppConfig {
    // 方法的名字作为Bean的Name
    @Bean
    public A a(){
        return new A();
    }

//    // 如果 IoC 容器种不存在 a Bean 的话，执行下面
//    @ConditionalOnMissingBean(A.class)
//    // 如果 IoC 容器种存在 a Bean 的话，执行下面
//    //@ConditionalOnBean(A.class)
//    @Bean
//    public B b(){
//        return new B();
//    }
}
