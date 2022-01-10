package com.assignments.groupLanguages.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.assignments.groupLanguages.models.Language;
import com.assignments.groupLanguages.service.LanguageService;

@Controller
public class HomeController {
	
	@Autowired
	private LanguageService languageService;
	
	//All language List
	@GetMapping("/languages")
	public String getLanguages(Model model) {
		List<Language> languages = languageService.getAllLanguages();
		model.addAttribute("languages",languages);
		
		return "index.jsp";
		
		}
	 //create language
    @PostMapping("/languages")
    public String createLanguages() {
        return "redirect:/languages";
        
    }
  //shows language details
    @GetMapping("/languages/{id}")
    public String getLanguagesid(@PathVariable("id") Long id,Model model) {
       
        return "details.jsp";
    }
    
    
	
	

}
