package com.emc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MemoryLeaksApplication {

	public static void main(String[] args) {
		SpringApplication.run(MemoryLeaksApplication.class, args);
	}
}
