package com.task3.multithreading;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class MultiThreadingApplication {

	public static void main(String[] args) {
		SpringApplication.run(MultiThreadingApplication.class, args);
	}

}
