package com.spring.docker.demo.SpringWithDocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringWithDockerApplication {
	
	@GetMapping("/message")
	public String printMessage() {
		return "Welcome to the world of spring boot with Docker !!";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringWithDockerApplication.class, args);
	}
}
