package com.assignments.studentroster.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.assignments.studentroster.models.Student;
import com.assignments.studentroster.services.StudentService;

@Controller
public class StudentController {
	@Autowired
	private StudentService sService;
	
//	@Autowired
//	private ContactInfoService cService;
	
	@GetMapping("/students/new")
	public String index(@ModelAttribute ("newStudent")Student student) { 
		return "/student/newstudent.jsp";		
	}
	@PostMapping("/students/new")
	public String create(@Valid @ModelAttribute("newStudent") Student student, BindingResult result) {
		if(result.hasErrors()) {
			return "/student/newstudent.jsp";
		}
		else {
			 this.sService.create(student);
			 return "redirect:/";
		}
		
	}
}
