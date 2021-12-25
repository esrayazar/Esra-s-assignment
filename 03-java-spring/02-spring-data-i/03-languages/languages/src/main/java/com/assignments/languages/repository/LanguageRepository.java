package com.assignments.languages.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.assignments.languages.models.Language;

@Repository                                             
public interface LanguageRepository extends CrudRepository<Language, Long>{
	List<Language> findAll();//SELECT *FROM albums
	

	

	
}