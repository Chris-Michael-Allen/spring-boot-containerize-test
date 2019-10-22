package com.revature.ask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloWorldBootTestApplication {

	
	@RequestMapping("/1908-reston")
	public String initialMessage() {
		return "This is an initial message after attempting to containerize the boot project!";
	}
	public static void main(String[] args) {
		SpringApplication.run(HelloWorldBootTestApplication.class, args);
	}

}
