package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootWithKafkaApplication {

	public static void main(String[] args) {
		System.out.println("Application Started");
		SpringApplication.run(SpringBootWithKafkaApplication.class, args);
	}
}
