package com.spring.docker.demo.SpringWithDocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringWithDockerApplication {

	@GetMapping("/message") 
	public String printMessage() {
	        System.out.println("Message is on its way....");
		return "Welcome to the world of spring boot with Docker !!";
	}

	public static void main(String[] args) {
		System.out.println("Invoking the main method..");
		SpringApplication.run(SpringWithDockerApplication.class, args);
	}

}
