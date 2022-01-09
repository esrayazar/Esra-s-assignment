package com.assignments.groupLanguages.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
	
//	@Autowired
//	private LanguageService languageService;
	
	//All language List
	@GetMapping("/languages")
	public String getLanguages(Model model) {
//		List<Language> languages =languageService.getAllLanguages();
//		model.addAttribute("languages", languages)
		return "index.jsp";
		
		}
	 //create language
    @PostMapping("/languages")
    public String createLanguages() {
        System.out.println("post request is recieved = " + language);
//        languageService.save(language);
        //name=Esra&creator=Esra+Yazar&version=1
        return "redirect:/languages";
        
    }
  //shows language details
    @GetMapping("/languages/{id}")
    public String getLanguagesid(@PathVariable("id") Long id,Model model) {
        System.out.println("languageId = "+ id);
//        Language language = languageService.getLanguageById(id);
//        model.addAttribute("language", language);
        return "details.jsp";
    }
	
	

}
