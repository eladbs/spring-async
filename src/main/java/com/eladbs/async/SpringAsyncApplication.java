package com.eladbs.async;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync //TODO 1. add this annotation
public class SpringAsyncApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAsyncApplication.class, args);
	}

}
