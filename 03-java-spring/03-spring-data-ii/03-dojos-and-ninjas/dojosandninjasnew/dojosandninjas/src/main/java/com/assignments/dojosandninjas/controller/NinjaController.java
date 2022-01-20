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
import com.assignments.dojosandninjas.models.Ninja;
import com.assignments.dojosandninjas.services.DojoService;
import com.assignments.dojosandninjas.services.NinjaService;

@Controller
public class NinjaController {
	@Autowired
	private DojoService dService;
	
	@Autowired
	private NinjaService nService;
	
	@GetMapping("/ninjas/new")
	public String addNinja(
			@ModelAttribute("newNinja") Ninja newNinja,Model model) {
		model.addAttribute("ninjas", nService.getAllNinjas());
		model.addAttribute("allDojos", dService.getAllDojos());
		return "newninja.jsp";
	}
	@PostMapping("/ninjas/new")
	public String create(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result) {
		if (result.hasErrors()) {
			return "newninja.jsp";
		} else {
			this.nService.create(ninja);
			return "redirect:/";
		}
	}
	
	@GetMapping("/editninjas/{id}")
	public String edit(@PathVariable("id") Long id, Model model) {
		model.addAttribute("ninja", this.nService.getOneNinja(id));
		return "editninja.jsp";
	}
	
	@PutMapping("/editninjas/{id}")
	public String editedit(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result, @PathVariable("id") Long id,
			Model model) {
		if (result.hasErrors()) {
			return "editninja.jsp";

		} else {
			this.nService.editNinja(ninja);
			return "redirect:/";
		}
	}
	
	@DeleteMapping("/deleteninjas/{id}")
    public String delete(@PathVariable("id") Long id) {
		nService.deleteNinja(id);
        return "redirect:/";
    }
	


}
