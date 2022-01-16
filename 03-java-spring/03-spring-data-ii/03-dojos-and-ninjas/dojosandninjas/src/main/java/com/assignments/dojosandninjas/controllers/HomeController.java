package com.assignments.dojosandninjas.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
	public String createDojo(@Valid @ModelAttribute("dojo") Dojo dojo , BindingResult result, Model model) {
		if(result.hasErrors()) {
			System.out.println("hata= "+result.getFieldError().getDefaultMessage());
			model.addAttribute("error", result.getFieldError().getDefaultMessage());
			return "newdojo.jsp";
		}else {
			dojoService.save(dojo);
			return "redirect:/";
		}
		
	}
	
	@GetMapping("/dojos/${id}")
	public String showNinjas(@PathVariable("id") Long id) {
		return "dojodetail.jsp";
	}
	
	

}
