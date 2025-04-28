package com.sangui.springboot;

import com.sangui.springboot.bean.Vip;
import com.sangui.springboot.mapper.VipMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@MapperScan(basePackages = "com.sangui.springboot.mapper")
@SpringBootApplication
public class Springboot313MybatisGeneratorApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(Springboot313MybatisGeneratorApplication.class, args);

        VipMapper vipMapper = applicationContext.getBean(VipMapper.class);

        Vip vip = Vip.builder()
                .name("zhangsan")
                .cardNumber("13423423")
                .birth("2000-01-01")
                .build();
        vipMapper.insert(vip);
        Vip vip2 = vipMapper.selectByPrimaryKey(1L);
        System.out.println(vip2);

        applicationContext.close();
    }

}
