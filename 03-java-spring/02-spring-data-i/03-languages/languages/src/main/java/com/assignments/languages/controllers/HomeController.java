package com.assignments.languages.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.assignments.languages.models.Language;
import com.assignments.languages.service.LanguageService;

@Controller
public class HomeController {
	
	@Autowired
	private LanguageService languageService;
	
	@GetMapping("/languages")
	public String getLanguages(Model model) {
		System.out.println("getting languages");
		List<Language> languages = languageService.getAllLanguages();
		System.out.println("retrived database record count = " + languages.size());
		model.addAttribute("languages", languages);
		return "index.jsp";
	}
	
	@PostMapping("/languages")
	public String createLanguages(Language language) {
		System.out.println("post request is recieved = " + language);
		languageService.save(language);
		//name=Esra&creator=Esra+Yazar&version=1
		return "redirect:/languages";
		
	}
	
//	@GetMapping("/languages/{id}")
//	public String getLanguagesid(@PathVariable("id") Long bookid ,Model model) {
//		System.out.println("book id = "+ bookid);
//		return "index.jsp";
//	}
	
	

}
