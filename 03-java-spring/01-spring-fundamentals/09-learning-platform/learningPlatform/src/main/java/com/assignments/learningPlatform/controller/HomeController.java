package com.assignments.learningPlatform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HomeController {
	@GetMapping("/")
	public String home() {
		return "index.jsp";
	}
	
	@GetMapping("/m/{chapter}/0553/{assignmentNumber}")
	public String course(@PathVariable("chapter") String chapter ,
			@PathVariable("assignmentNumber") String assignmentNumber,
			Model model){
		switch(assignmentNumber){
		case "0733":
			model.addAttribute("content","Setting up your servers");
			break;
		case "0342":
			model.addAttribute("content","Punch Cards");
			break;
		case "0348":
			model.addAttribute("content","Advanced Fortran Intro");
			break;
			
		}
		return "lesson.jsp";
	}
	
	@GetMapping("/m/{chapter}/0483/{assignmentNumber}")
	public String assignment(@PathVariable("chapter") String chapter ,
			@PathVariable("assignmentNumber") String assignmentNumber,
			Model model){
		switch(assignmentNumber){
		case "0345":
			model.addAttribute("content","Coding Forms");
			break;
		case "2342":
			model.addAttribute("content","Fortran to Binary");
			break;
			
		}
		return "assignment.jsp";
	}
	
}
