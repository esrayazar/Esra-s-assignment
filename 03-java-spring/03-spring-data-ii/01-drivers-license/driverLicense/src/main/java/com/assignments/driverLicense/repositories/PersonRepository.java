package com.assignments.driverLicense.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.assignments.driverLicense.models.Person;

@Repository                                             
public interface PersonRepository extends CrudRepository<Person, Long>{
	List<Person> findAll();//SELECT *FROM albums


	}