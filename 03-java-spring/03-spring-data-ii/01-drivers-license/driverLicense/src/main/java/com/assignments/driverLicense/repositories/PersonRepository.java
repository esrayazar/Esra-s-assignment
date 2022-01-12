package com.assignments.driverLicense.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.assignments.driverLicense.models.person;

@Repository                                             
public interface PersonRepository extends CrudRepository<person, Long>{
	List<person> findAll();//SELECT *FROM albums


	}