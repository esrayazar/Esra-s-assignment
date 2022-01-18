package com.esra.auth.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.esra.auth.models.User;
import com.esra.auth.services.UserService;
import com.esra.auth.validator.UserValidator;

@Controller
public class HomeController {
	@Autowired
	private UserService userService;
	@Autowired
	private UserValidator userValidator;
	
	@GetMapping("/")
	public String index(@ModelAttribute("user") User user) {
		return "index.jsp";
	}
	
	//register a user
	@PostMapping("/registration")
	public String registerUser(@Valid @ModelAttribute("user") User user, BindingResult results, HttpSession session) {
		userValidator.validate(user, results);
		
		if(results.hasErrors()) {
			return "index.jsp";
		}else {
			User newUser= userService.registerUser(user);
			session.setAttribute("userId", newUser.getId());
			
			return "redirect:/projects";
		}
	}
	
	//Login
	@PostMapping("/login")
	
	public String loginUser(@RequestParam("email") String email, @RequestParam("password") String password, HttpSession session, RedirectAttributes redirectAttributes) {
        // if the user is authenticated, save their user id in session
		if(userService.authenticateUser(email, password)) {
			User user=userService.findByEmail(email);
			session.setAttribute("userId", user.getId());
			return "redirect:/projects";
		}else {
			redirectAttributes.addFlashAttribute("error","Invalid user/pass");
			return "redirect:/";
		}
	}
	
	//Logout
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
	
	// *************************Project Routes*******************
	
	//Project Dashboard
	@GetMapping("/projects")
	public String projects(Model model,HttpSession session) {
		if(session.getAttribute("userId")!=null) {
			User user=userService.findById((Long)session.getAttribute("userId"));
			model.addAttribute("user",user);
			return "projects.jsp";
		}else {
			return "redirect:/";
		}
	}
	
	
	
	
	
	

}
