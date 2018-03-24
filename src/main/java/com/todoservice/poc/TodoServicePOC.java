package com.todoservice.poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.todoservice.poc.configuration.JpaConfiguration;


@Import(JpaConfiguration.class)
@SpringBootApplication(scanBasePackages={"com.todoservice.poc"})// same as @Configuration @EnableAutoConfiguration @ComponentScan
public class TodoServicePOC {

	public static void main(String[] args) {
		SpringApplication.run(TodoServicePOC.class, args);
	}
}
