package com.assignments.displaydate.controllers;

import java.sql.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/date")
	public String dateEndPoint(Model model) {
		java.util.Date myDate= new java.util.Date();
		model.addAttribute("date",myDate);
		return "date.jsp";
	}
	@RequestMapping("/time")
	public String timeEndPoint() {
		return "time.jsp";
	}
	@RequestMapping("/")
	public String home() {
		return "index.jsp";
	}
	

}
