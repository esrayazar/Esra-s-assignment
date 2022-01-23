package com.assignments.dojooverflow.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.assignments.dojooverflow.models.Question;

public interface QuestionRepository extends CrudRepository <Question, Long> {
	List <Question> findAll();

}
