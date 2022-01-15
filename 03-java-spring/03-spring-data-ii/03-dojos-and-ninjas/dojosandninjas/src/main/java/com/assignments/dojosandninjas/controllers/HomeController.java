package com.assignments.dojosandninjas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.assignments.dojosandninjas.models.Dojo;
import com.assignments.dojosandninjas.services.DojoService;

@Controller
public class HomeController {
	
	@Autowired
	private DojoService dojoService;
	
	
	@GetMapping("/")
	public String homepage() {
		return "homepage.jsp";
	}
	
	@GetMapping("/dojos/new")
	public String createDojoDisplay() {
		return "newdojo.jsp";
	}
	
	@PostMapping("/dojos/new")
	public String createDojo(Dojo dojo) {
		dojoService.save(dojo);
		return "redirect:/";
	}
	
	

}
