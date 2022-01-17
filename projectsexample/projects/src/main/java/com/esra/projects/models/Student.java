package com.esra.projects.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name="students")
public class Student {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	@Size(min=2, max=200, message="First Name should be between 2-200")
	private String firstName;
	@NotBlank
	@Size(min=2, max=200, message="First Name should be between 2-200")
	private String lastName;
	
	@NotBlank
	@Email(message="invalid email")
	private String email;
	
	@OneToMany(mappedBy ="student", fetch = FetchType.LAZY)
	private List<Project> projects;
	

}
