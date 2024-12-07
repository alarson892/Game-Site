package com.gamesite.gamesite;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}
	@GetMapping("/test")
	public String test() {
		return "<h1>Hello world!</h1>";
	}

	@GetMapping("/testHTML")
	public String testHTML() {
		return "<h1>Hello world!</h1><br>TEST";
	}
}
