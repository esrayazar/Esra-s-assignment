package com.assignments.dojosandninjas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignments.dojosandninjas.models.Dojo;
import com.assignments.dojosandninjas.repositories.DojoRepository;

@Service
public class DojoService {
	@Autowired
	private DojoRepository dojoRepo;
	
	public List<Dojo> getAllDojos(){
		return this.dojoRepo.findAll();
	}
	public Dojo create(Dojo newDojo) {
		return this.dojoRepo.save(newDojo);
	}
	public void deleteDojo(Long id) {
		this.dojoRepo.deleteById(id);
	}
	
//	@Modifying
//	public Dojos update(Dojos updateDojo, Long id) {
//		return dojoRepo.save(updateDojo);
//	}	
	
	public Dojo editDojo(Dojo dojo) {
		return this.dojoRepo.save(dojo);
	}
	public Dojo getOneDojo(Long id) {
		return this.dojoRepo.findById(id).orElse(null);
	}
	

}
