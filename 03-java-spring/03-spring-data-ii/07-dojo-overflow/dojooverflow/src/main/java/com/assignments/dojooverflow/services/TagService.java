package com.assignments.dojooverflow.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignments.dojooverflow.models.Tag;
import com.assignments.dojooverflow.repositories.TagRepository;

@Service
public class TagService {
	@Autowired
	private TagRepository tRepo;
	
	//create
	public void createTag(Tag tag) {
		this.tRepo.save(tag);
	}
	//Get All
	public List<Tag> getAllTag(){
		return this.tRepo.findAll();
	}
	//Get One
	
	public Tag getOndeTag(Long id) {
		return this.tRepo.findById(id).orElse(null);
	}

}
