package com.assignments.languages.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.assignments.languages.models.Language;
import com.assignments.languages.service.LanguageService;

@Controller
public class HomeController {
	
	@Autowired
	private LanguageService languageService;
	
	//all language lists
	@GetMapping("/languages")
	public String getLanguages(Model model) {
		System.out.println("getting languages");
		List<Language> languages = languageService.getAllLanguages();
		System.out.println("retrived database record count = " + languages.size());
		model.addAttribute("languages", languages);
		return "index.jsp";
	}
	
	//create language
	@PostMapping("/languages")
	public String createLanguages(Language language) {
		System.out.println("post request is recieved = " + language);
		languageService.save(language);
		//name=Esra&creator=Esra+Yazar&version=1
		return "redirect:/languages";
		
	}
	//shows language details
	@GetMapping("/languages/{id}")
	public String getLanguagesid(@PathVariable("id") Long id,Model model) {
		System.out.println("languageId = "+ id);
		Language language = languageService.getLanguageById(id);
		model.addAttribute("language", language);
		return "details.jsp";
	}
	//delete language
	@GetMapping("/delete/{id}")
	public String deleteLanguage(@PathVariable("id") Long id) {
		System.out.println("languageId = "+ id);
		languageService.delete(id);
		return "redirect:/languages";
	}
	
	//edit language
	@GetMapping("/languages/{id}/edit")
	public String editLanguage(@PathVariable("id") Long id , Model model) {
		Language language = languageService.getLanguageById(id);
		model.addAttribute("language", language);
		
		return "edit.jsp";
	}
		
	
	

}
