package com.assignments.dojooverflow.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.assignments.dojooverflow.models.Question;
import com.assignments.dojooverflow.models.Tag;
import com.assignments.dojooverflow.services.AnswerService;
import com.assignments.dojooverflow.services.QuestionService;
import com.assignments.dojooverflow.services.TagService;

@Controller
public class HomeController {
	@Autowired
	private QuestionService qService;
	@Autowired
	private AnswerService aService;
	@Autowired
	private TagService tService;
	
	@GetMapping("/questions")
	public String dashboard(@ModelAttribute("show") Question question, Tag t, Model model) {
		model.addAttribute("allQuestion", qService.getAllQuestion());
		model.addAttribute("allTags",tService.getAllTag() );
		return "dashboard.jsp";
	}
	

}
