package com.esra.auth.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.esra.auth.models.User;
import com.esra.auth.services.UserService;

@Controller
public class HomeController {
	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public String index(@ModelAttribute("user") User user) {
		return "index.jsp";
	}
	
	//register a user
	@PostMapping("/registration")
	public String registerUser(@Valid @ModelAttribute("user") User user, BindingResult results, HttpSession session) {
		if(results.hasErrors()) {
			return "index.jsp";
		}else {
			User newUser= userService.registerUser(user);
			session.setAttribute("userId", newUser.getId());
			
			return "projects.jsp";
		}
	}
	

}
