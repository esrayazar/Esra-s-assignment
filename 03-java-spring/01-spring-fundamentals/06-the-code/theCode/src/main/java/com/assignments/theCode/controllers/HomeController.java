package com.assignments.theCode.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
	@GetMapping("/")
	public String code() {
		return "index.jsp";
	}
	@PostMapping("/")
	public String checkCode(String userInput) {
		System.out.println("code is here " + userInput);
		String secret = "bushido";
		if(userInput.equals(secret)) {
			// matched - route to secret page
			return "redirect:/code";
		} else {
			// wrong: display error message on '/' 
			return "index.jsp";
		}
		
	}


}
