package com.assignments.driverLicense.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.assignments.driverLicense.controllers.PersonController;

@Repository                                             
public interface PersonRepository extends CrudRepository<PersonController, Long>{
	List<PersonController> findAll();//SELECT *FROM albums


	}