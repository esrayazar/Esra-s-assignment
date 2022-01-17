package com.esra.projects.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.esra.projects.models.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {
	
	//Get all student
	List <Student> findAll();

}
