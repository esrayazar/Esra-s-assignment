package com.assignments.languages.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignments.languages.models.Language;
import com.assignments.languages.repository.LanguageRepository;

@Service
public class LanguageService {
	
	@Autowired
	private LanguageRepository languageRepository;
	
	public void save(Language language) {
		languageRepository.save(language);
	}
	
	public List<Language> getAllLanguages(){
		return languageRepository.findAll();
	}
	

}
