package com.esra.projects.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.esra.projects.services.ProjectService;
import com.esra.projects.services.StudentService;

@Controller
public class HomeController {
	@Autowired
	private StudentService sService;
	@Autowired
	private ProjectService pService;
	
	
	@GetMapping("/")
	public String dashBoard(Model model) {
		model.addAttribute("projects", pService.getAllProjects());
		return "/projects/dashboard.jsp";
	}

}
