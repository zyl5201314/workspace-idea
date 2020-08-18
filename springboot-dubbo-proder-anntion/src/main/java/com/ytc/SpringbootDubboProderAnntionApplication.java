package com.ytc;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ytc.dao")
@EnableDubboConfiguration  //自动扫描dubbo注解
public class SpringbootDubboProderAnntionApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDubboProderAnntionApplication.class, args);
	}

}
