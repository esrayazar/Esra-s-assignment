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
	public List<Project> getAllProjects(){
		return projectRepo.findAll();
	}
	//Create
	public Project createProject(Project newProject) {
		return projectRepo.save(newProject);
	}
	//Update
	public Project updateProject(Project project) {
		return projectRepo.save(project);
	}
	//Delete
	public void deleteProject(Long Id) {
		projectRepo.deleteById(Id);
	
	}
	//Details
	
	public Project projectDetails(Long id) {
		return projectRepo.findById(id).orElse(null);
	}
	
}
