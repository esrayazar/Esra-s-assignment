package com.assignments.studentroster.controllers;



import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.assignments.studentroster.models.ContactInfo;
import com.assignments.studentroster.models.Student;
import com.assignments.studentroster.services.ContactInfoService;
import com.assignments.studentroster.services.StudentService;

@Controller
public class StudentController {
	@Autowired
	private StudentService sService;
	
	@Autowired
	private ContactInfoService cService;
	
	@GetMapping("/students/new")
	public String newStudent(@ModelAttribute ("newStudent")Student student) { 
		return "/student/newstudent.jsp";		
	}
	@PostMapping("/students/new")
	public String create(@Valid @ModelAttribute("newStudent") Student student, BindingResult result) {
		if(result.hasErrors()) {
			return "/student/newstudent.jsp";
		}
		else {
			 this.sService.create(student);
			 return "redirect:/students/new";
		}
	}
	
	@GetMapping("/contact/new")
	public String cotactInfo(@ModelAttribute ("contact") ContactInfo contact, Model model) { 
		model.addAttribute("students", sService.getAllStudents());
		return "/student/contactinfo.jsp";		
	}
	@PostMapping("/contact/new")
	public String createContact(@Valid @ModelAttribute("contact") ContactInfo contact, BindingResult result) {
		if(result.hasErrors()) {
			return "/student/contactinfo.jsp";
		}
		else {
			 this.cService.create(contact);
			 return "redirect:/students";
		}
	}
	
	@GetMapping("/students")
	public String getAllStudent(Model model) { 
		model.addAttribute("students", sService.getAllStudents());
		model.addAttribute("info", cService.getAllStudentsInfo());
		return "/student/allstudents.jsp";	
	}
	
	// /students/create?firstName=John&lastName=Doe&age=35
	@GetMapping("/students/create")
	public String createStudent(@RequestParam String firstName, @RequestParam String lastName, @RequestParam Long age) { 
		Student student = new Student(firstName,lastName,age);
		sService.create(student);
		return "redirect:/students";	
	}
	
	// /contacts/create?student=1&address=1234%20Some%20Street&city=Los%20Angeles&state=CA
	// Make sure to change student=??? to a new student id
	@GetMapping("/contacts/create")
	public String createContact(@RequestParam Long student, @RequestParam String address , @RequestParam String city, @RequestParam String state) { 
		System.out.println("address:"+address);
		Student studentObj = new Student(student);
		ContactInfo info = new ContactInfo(address,city,state,studentObj);
		cService.create(info);
		return "redirect:/students";	
	}
	
	
	
	
}
