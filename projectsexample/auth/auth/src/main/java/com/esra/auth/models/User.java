package com.esra.auth.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name="users")
public class User {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	@Size(min=2, max = 200, message="First Name should be between 2-200 long")
	private String firstName;
	
	private String lastName;
	
	@Email
	private String email;
	
	@NotBlank
	@Size(min=2, max = 200, message="password should be between 2-200 long")
	private String password;
	
	
	

}
