package com.vidhya;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoSpringBootProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringBootProjectApplication.class, args);
	}
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello From vidhya demo!";
	}

}

