package com.assignments.dojosandninjas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignments.dojosandninjas.models.Ninja;
import com.assignments.dojosandninjas.repositories.NinjaRepository;


@Service
public class NinjaService {
	@Autowired
	private NinjaRepository ninjaRepo;

	public void save(Ninja ninja) {
		ninjaRepo.save(ninja);
	
		
	}

}
