package com.sangui.ssm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@MapperScan(basePackages = "com.sangui.ssm.mapper")
@SpringBootApplication
public class Springboot314SsmApplication {
	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext =
				SpringApplication.run(Springboot314SsmApplication.class, args);
	}
}
