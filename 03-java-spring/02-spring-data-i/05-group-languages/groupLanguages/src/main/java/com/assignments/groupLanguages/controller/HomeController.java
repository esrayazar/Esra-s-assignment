package com.assignments.groupLanguages.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class HomeController {
	
	@Autowired
	private LanguageService languageService;
	
	//All language List
	@GetMapping("/languages")
	public String getLanguages(Model model) {
		List<Language> languages =languageService.getAllLanguages();
		model.addAttribute("languages", languages)
		return "index.jsp";
		
		}
	
	

}
