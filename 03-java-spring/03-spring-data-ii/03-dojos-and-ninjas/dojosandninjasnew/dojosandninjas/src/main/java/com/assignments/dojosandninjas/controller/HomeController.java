package com.assignments.dojosandninjas.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.assignments.dojosandninjas.models.Dojo;
import com.assignments.dojosandninjas.services.DojoService;

@Controller
public class HomeController {
@Autowired
private DojoService dojoService;

@GetMapping("/")
public String index() {
	return "index.jsp";
}
@GetMapping("/dojos/new")
public String createDojoDisplay() {
	return "newdojo.jsp";
}

@PostMapping("/dojos/new")
public String create(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result
		) {
	if(result.hasErrors()) {
		return "newdojo.jsp";
	} 
	else { 
		this.dojoService.create(dojo);
		return "redirect:/";
	}
}

}
