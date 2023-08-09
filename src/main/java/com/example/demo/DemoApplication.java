package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/")
	public String home() {
		return "Welcome to My Spring Boot Application! the endpoints are => localhost:8080/hello => localhost:8080/greet => localhost:8080/square => localhost:8080/sum => localhost:8080/reverse";
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}

	@GetMapping("/greet")
	public String greet() {
		return "Greetings from Spring Boot!";
	}

	@GetMapping("/square")
	public int square() {
		int number = 5;
		return number * number;
	}

	@GetMapping("/sum")
	public int sum() {
		int num1 = 10;
		int num2 = 20;
		return num1 + num2;
	}

	@GetMapping("/reverse")
	public String reverse() {
		String input = "Hello";
		StringBuilder reversed = new StringBuilder(input);
		return reversed.reverse().toString();
	}
}
