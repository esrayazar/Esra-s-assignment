package com.esra.projects.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.esra.projects.models.Project;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Long> {
	
	//Get all project
	List <Project> findAll();

}