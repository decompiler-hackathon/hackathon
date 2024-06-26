package com.hackaton.hackaton;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class HackatonApplication {

	public static void main(String[] args) {
		SpringApplication.run(HackatonApplication.class, args);
	}

}
