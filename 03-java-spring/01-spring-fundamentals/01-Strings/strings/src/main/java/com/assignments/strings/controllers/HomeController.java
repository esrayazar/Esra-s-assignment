package com.assignments.strings.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/")
	public String home() {
		return "Hello client! How are you doing?";
	}
	
	@GetMapping("/random")
	public String random() {
		return "Spring Boot is great! So easy to just respond with strings";
		
	}
	

}
