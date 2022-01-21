package com.assignments.studentroster.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.assignments.studentroster.models.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {

//	Get list of Users 
	List<Student> findAll();
	
}