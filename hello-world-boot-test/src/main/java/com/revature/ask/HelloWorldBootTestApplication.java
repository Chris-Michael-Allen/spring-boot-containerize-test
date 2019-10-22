package com.revature.ask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloWorldBootTestApplication {

	@RequestMapping("/project-3/hello")
	public String printGreeting() {
		return "Hello Docker, this is for Revature 1908 Project 3!";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(HelloWorldBootTestApplication.class, args);
	}

}
