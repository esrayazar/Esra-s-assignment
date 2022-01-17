package com.esra.projects.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name="projects")
public class Project {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	@Size(min=2, max=200, message="Project Name should be between 2-200")
	private String projectName;
	@NotBlank
	@Size(min=10, max=200, message="Description should be between 10-200")
	private String description;
	

}
