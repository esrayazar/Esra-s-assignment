package com.assignments.dojosandninjas.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.assignments.dojosandninjas.models.Dojo;
import com.assignments.dojosandninjas.services.DojoService;

@Controller
public class HomeController {
	@Autowired
	private DojoService dojoService;

	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("newDojo", this.dojoService.getAllDojos());
		return "index.jsp";
	}

	@GetMapping("/dojos/new")
	public String createDojoDisplay(@ModelAttribute("dojo") Dojo dojo) {
		return "newdojo.jsp";
	}

	@PostMapping("/dojos/new")
	public String create(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		if (result.hasErrors()) {
			return "newdojo.jsp";
		} else {
			this.dojoService.create(dojo);
			return "redirect:/";
		}
	}
//
//	@GetMapping("/edit/{id}")
//	public String edit(@PathVariable("id") Long id, @ModelAttribute("dojo") Dojo dojo, Model model) {
//		model.addAttribute("dojo", this.dojoService.getOneDojo(id));
//		return "edit.jsp";
//	}
//
//@PostMapping("/edit/{id}")
//public String edit(@Valid @ModelAttribute ("dojo") Dojo dojo, BindingResult result ,@PathVariable("id")Long id, Model model) {
//	if(result.hasErrors()) {
////		model.addAttribute("dojo",this.dojoService.getOneDojo(id));
//		return "edit.jsp";
//		
//	} 
//	else { 
//		this.dojoService.editDojo(dojo);
//		return "redirect:/";
//	}
//}
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Long id, Model model) {
		model.addAttribute("dojo", this.dojoService.getOneDojo(id));
		return "edit.jsp";
	}

	@PutMapping("/edit/{id}")
	public String editedit(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result, @PathVariable("id") Long id,
			Model model) {
		if (result.hasErrors()) {
//	model.addAttribute("dojo",this.dojoService.getOneDojo(id));
			return "edit.jsp";

		} else {
			this.dojoService.editDojo(dojo);
			return "redirect:/";
		}
	}
	
	@DeleteMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long id) {
		dojoService.deleteDojo(id);
        return "redirect:/";
    }


}
