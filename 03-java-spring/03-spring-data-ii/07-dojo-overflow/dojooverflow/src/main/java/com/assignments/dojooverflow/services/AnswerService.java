package com.assignments.dojooverflow.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignments.dojooverflow.models.Answer;
import com.assignments.dojooverflow.models.Question;
import com.assignments.dojooverflow.repositories.AnswerRepository;

@Service
public class AnswerService {
	@Autowired
	private AnswerRepository answerRepo;
	
	//Create
		public void createQuestion(Answer answer) {
			this.answerRepo.save(answer);
		}
		//Get All Question
		public List<Answer> getAllQuestion(){
			return this.answerRepo.findAll();
		}
		//Get One Question
		public Answer getOneQuestion(Long id) {
			return this.answerRepo.findById(id).orElse(null);
		}

}
