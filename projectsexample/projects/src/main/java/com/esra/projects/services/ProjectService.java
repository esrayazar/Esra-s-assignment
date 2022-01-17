package com.esra.projects.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esra.projects.models.Project;
import com.esra.projects.repositories.ProjectRepository;

@Service
public class ProjectService {
	
	@Autowired
	private ProjectRepository projectRepo;

	//Get All Project
	private List<Project> getAllProjects(){
		return projectRepo.findAll();
	}
	//Create
	private Project createProject(Project newProject) {
		return projectRepo.save(newProject);
	}
	//Update
	private Project updateProject(Project project) {
		return projectRepo.save(project);
	}
	//Delete
	private void deleteProject(Long id) {
		projectRepo.deleteById(id);
	}
	//Project Details
	
	
	
}
