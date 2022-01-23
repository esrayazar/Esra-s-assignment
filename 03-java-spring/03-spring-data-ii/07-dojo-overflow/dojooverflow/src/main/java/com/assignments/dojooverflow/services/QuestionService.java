package com.assignments.dojooverflow.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignments.dojooverflow.models.Question;
import com.assignments.dojooverflow.repositories.QuestionRepository;

@Service
public class QuestionService {
	@Autowired
	private QuestionRepository questionRepo;
	
	//Create
	public void createQuestion(Question question) {
		this.questionRepo.save(question);
	}
	//Get All Question
	public List<Question> getAllQuestion(){
		return this.questionRepo.findAll();
	}
	//Get One Question
	public Question getOneQuestion(Long id) {
		return this.questionRepo.findById(id).orElse(null);
	}
	
}
