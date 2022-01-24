package com.assignments.dojooverflow.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.assignments.dojooverflow.models.Answer;
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
		model.addAttribute("allQuestions", qService.getAllQuestion());
		model.addAttribute("allTags",tService.getAllTag() );
		return "dashboard.jsp";
	}
	
	@GetMapping("/questions/new")
	public String newQuestion(@ModelAttribute("newQuestion") Question question,Tag tag) {
		return "newquestion.jsp";
	}
	
	@PostMapping("questions/new")
	public String createQuestion(@Valid @ModelAttribute("newQuestion") Question question, BindingResult results) {
		System.out.println(question.toString());
		//		validator.validate(question, results);
		if(results.hasErrors()) {
			return "newquestion.jsp";
		}else {
			qService.createQuestion(question);
			return "redirect:/questions";
		}
	}
	
	@GetMapping("/questions/{id}")
	public String questiondetails( @PathVariable("id") Long id, Model model, @ModelAttribute("newAnswer") Answer answer) {
		Question question = qService.getOneQuestion(id);
		model.addAttribute("question", question);
		return "displayanswers.jsp";
	}
	
	@PostMapping("/questions/save")
	public String saveanswer(@Valid @ModelAttribute("newAnswer") Answer answer,BindingResult results) {
		System.out.println(answer.toString());
		if(results.hasErrors()) {
			return "displayanswers.jsp";
		}else {
			aService.saveAnswer(answer);
			return "redirect:/questions/" + answer.getQuestion().getId();
		}
	}
	


}
