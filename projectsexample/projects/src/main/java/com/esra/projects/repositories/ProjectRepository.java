package com.esra.projects.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.esra.projects.models.Project;


public interface ProjectRepository extends CrudRepository<Project, Long> {
	
	//Get all project
	List <Project> findAll();

}