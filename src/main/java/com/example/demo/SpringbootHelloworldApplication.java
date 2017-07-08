package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootHelloworldApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootHelloworldApplication.class, args);
	}
	
	@RequestMapping(value="/hello/{name}")
	public String greet(@PathVariable("name") String name){
		return String.format("Hi there, %s", name);
	}
}
