package com.sangui.springboot;

import com.sangui.springboot.bean.AppBean;
import com.sangui.springboot.bean.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ImportResource;

// 如果项目中有这种老的Spring XML配置文件，使用以下注解可以让XML生效
// SpringBoot主入口添加以下注解@ImportantResource，让XML配置文件生效。
@ImportResource("classpath:/applicationContext.xml")
@EnableConfigurationProperties({User.class, AppBean.class})
//@ConfigurationPropertiesScan(basePackageClasses = User.class)
@SpringBootApplication
public class Springboot310ConfigBindToBeanApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot310ConfigBindToBeanApplication.class, args);
    }

}
