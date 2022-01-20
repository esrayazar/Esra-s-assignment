package com.assignments.dojosandninjas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignments.dojosandninjas.models.Ninja;
import com.assignments.dojosandninjas.repositories.NinjaRepository;

@Service
public class NinjaService {
	@Autowired
	private NinjaRepository ninjaRepo;
	
	public List <Ninja> getAllNinjas(){
		return this.ninjaRepo.findAll();
	}
	
	public Ninja create(Ninja newNinja) {
		return this.ninjaRepo.save(newNinja);
	}
	
	public Ninja editNinja(Ninja ninja) {
		return this.ninjaRepo.save(ninja);
	}
	public Ninja getOneNinja(Long id) {
		return this.ninjaRepo.findById(id).orElse(null);
	}
	public void deleteNinja(Long id) {
		this.ninjaRepo.deleteById(id);
	}

}
