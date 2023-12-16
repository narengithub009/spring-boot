package com.java.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/test")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@GetMapping("/msg")
	public String getMessage() {
		System.out.println("Hello World.......");
		return "Hello World....";
	}
	@GetMapping("/bmsg")
	public String getBranchMessage() {
		System.out.println("Hello getBranchMessage World.......");
		return "Hello getBranchMessage World....";
	}
}
