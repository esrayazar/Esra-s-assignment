package com.assignments.studentroster.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignments.studentroster.models.Student;
import com.assignments.studentroster.repositories.StudentRepository;

@Service
public class StudentService {
	@Autowired
	private StudentRepository sRepo;
	
//	Get me all Users 
	public List<Student> getAllStudents(){
		return this.sRepo.findAll();
	}
//Create User 
		public Student create(Student newStudent) {
			return this.sRepo.save(newStudent);
		}
		

}
