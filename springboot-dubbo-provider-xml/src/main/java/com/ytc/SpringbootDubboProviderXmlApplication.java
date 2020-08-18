package com.ytc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@MapperScan("com.ytc.dao")
@ImportResource("spring-dubbo-provider.xml")
public class SpringbootDubboProviderXmlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDubboProviderXmlApplication.class, args);
	}

}
