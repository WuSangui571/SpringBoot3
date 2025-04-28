package com.sangui.springboot;

import com.sangui.springboot.bean.Vip;
import com.sangui.springboot.service.VipService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

// 通过这个标注指定mapper的扫描
@MapperScan(basePackages = {"com.sangui.springboot.mapper"})
@SpringBootApplication
public class Springboot312MybatisApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(Springboot312MybatisApplication.class, args);
		VipService vipService = applicationContext.getBean(VipService.class);

		Vip vip1 = new Vip("jack2","1213125","1999-10-22");
		vipService.saveVip(vip1);

		Vip vip2 = new Vip("lucy2","1232416","1929-10-22");
		vipService.saveVip(vip2);

		vipService.getAll().forEach(System.out::println);

		applicationContext.close();
	}

}
