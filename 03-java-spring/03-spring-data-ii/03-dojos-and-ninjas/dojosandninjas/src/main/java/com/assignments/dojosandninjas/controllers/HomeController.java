package com.assignments.dojosandninjas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.assignments.dojosandninjas.services.NinjaService;

@Controller
public class HomeController {
	
	@Autowired
	private NinjaService ninjaService;
	
	@GetMapping("/dojos/new")
	public String createDojoDisplay() {
		return "newninja.jsp";
	}
	
	@PostMapping("/dojos/new")
	public String createDojo(String name) {
		System.out.println("post request captured. Name= " + name);
		return "redirect:/";
	}
	
	

}
