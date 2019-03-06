package com.siddu.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan("com.siddu")
public class BasicAuthApp {

	public static void main(String[] args) {
		SpringApplication.run(BasicAuthApp.class, args);
	}

	
}
