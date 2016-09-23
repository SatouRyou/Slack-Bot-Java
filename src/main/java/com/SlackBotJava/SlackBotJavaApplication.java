package com.SlackBotJava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"controller","domain","infrastructure"})
public class SlackBotJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SlackBotJavaApplication.class, args);
	}
}
