package com.assignments.groupLanguages.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.assignments.groupLanguages.models.Language;

public interface LaanguageRepository extends CrudRepository<Language, Long>{
	List<Language> findAll();

}
