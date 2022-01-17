package com.esra.projects.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.esra.projects.models.Student;
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
	
	@GetMapping("/students/new")
	public String newStudent(@ModelAttribute("student") Student student) {
		return "/students/new.jsp";
	}
	
	@PostMapping("/students/create")
	public String createStudent(@Valid @ModelAttribute("student") Student student, BindingResult result) {
		if (result.hasErrors()) {
			return "/students/new.jsp";
		}else {
			sService.createStudent(student);
			return "redirect:/";
		}
	}

}
