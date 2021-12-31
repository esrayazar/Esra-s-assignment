package com.assignments.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
	@GetMapping("/")
	public String home(HttpSession session) {
		// check if session attribute exists
		if(session.getAttribute("count")==null)
			session.setAttribute("count", 0);
		
		// get session attribute value
		Integer currentCount = (Integer) session.getAttribute("count");
		currentCount++;
		
		// update session attribute value
		session.setAttribute("count", currentCount);
		return "index.jsp";
	}
	
	@GetMapping("/counter")
	public String counter(Model model , HttpSession session) {
		if(session.getAttribute("count")==null)
			session.setAttribute("count", 0);
		Integer currentCount = (Integer) session.getAttribute("count");
        model.addAttribute("times", currentCount);
		return "counter.jsp";
	}
	
	@GetMapping("/double")
	public String doubleTest(Model model, HttpSession session) {
		// check if session attribute exists
		if(session.getAttribute("count")==null)
			session.setAttribute("count", 0);
		
		// get session attribute value
		Integer currentCount = (Integer) session.getAttribute("count");
		currentCount+=2;
		
		// update session attribute value
		session.setAttribute("count", currentCount);
		model.addAttribute("times", currentCount);
		return "double.jsp";
	}
	
	@PostMapping("/counter")
	public String reset(HttpSession session) {
		session.setAttribute("count", 0);
		System.out.println("Reseting");
		return "redirect:/counter";
	}

}
