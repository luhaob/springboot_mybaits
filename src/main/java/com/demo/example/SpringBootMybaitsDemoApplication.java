package com.demo.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.demo.example.mapper")
public class SpringBootMybaitsDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMybaitsDemoApplication.class, args);
	}

}

