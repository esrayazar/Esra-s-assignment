package com.assignments.dojoSurvey.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String Dojo() {
		return "survey.jsp";
	}
	
//    @RequestMapping(path="/result", method=RequestMethod.POST)
	@PostMapping("/result")
    public String info( @RequestParam("fullName") String name,
    		@RequestParam("location") String location,
    		@RequestParam("language") String language,
    		@RequestParam("comment") String comment,
    		Model studentModel){
		
		if (language.equals("JAVA")) {
			return "javapage.jsp";
		}
    	studentModel.addAttribute("fullName",name);
    	studentModel.addAttribute("location",location);
    	studentModel.addAttribute("language",language);
    	studentModel.addAttribute("comment",comment);
    	return "info.jsp";
    }


}
