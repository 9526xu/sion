package com.lol.sion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.lol.sion")
public class SionApplication {

	public static void main(String[] args) {
		SpringApplication.run(SionApplication.class, args);
	}
}
