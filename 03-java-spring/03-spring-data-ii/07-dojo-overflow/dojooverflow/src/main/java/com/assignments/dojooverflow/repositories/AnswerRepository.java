package com.assignments.dojooverflow.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.assignments.dojooverflow.models.Answer;

public interface AnswerRepository  extends CrudRepository <Answer, Long> {
	 
		List <Answer> findAll();

	

}
