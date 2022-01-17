package com.esra.projects.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esra.projects.models.Student;
import com.esra.projects.repositories.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepo;
	
	//Get All Students
	public List<Student> getAllStudents(){
		return studentRepo.findAll();
	}
	
	//Create New Student
	
	public Student createStudent(Student newStudent) {
		return studentRepo.save(newStudent);
	}
	
}
