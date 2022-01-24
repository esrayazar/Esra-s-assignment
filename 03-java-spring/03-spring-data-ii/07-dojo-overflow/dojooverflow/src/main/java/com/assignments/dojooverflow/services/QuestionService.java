package com.assignments.dojooverflow.services;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.assignments.dojooverflow.models.Question;
import com.assignments.dojooverflow.models.Tag;
import com.assignments.dojooverflow.repositories.QuestionRepository;

@Service
public class QuestionService {
	@Autowired
	private QuestionRepository questionRepo;
	
	//Create
	public void createQuestion(Question question) {
		question.setTags(this.getTokens(question.getTemptags()));
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
	
	private List<Tag> getTokens(String str) {
	    List<Tag> tags = new ArrayList<>();
	    StringTokenizer tokenizer = new StringTokenizer(str, ",");
	    while (tokenizer.hasMoreElements()) {
	    	Tag tag = new Tag();
	    	tag.setSubject(tokenizer.nextToken());
	        tags.add(tag);
	    }
	    return tags;
	}
	

}
