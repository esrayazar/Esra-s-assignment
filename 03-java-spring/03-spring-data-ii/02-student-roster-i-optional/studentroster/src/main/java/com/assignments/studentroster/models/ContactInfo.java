package com.assignments.studentroster.models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="Info")
public class ContactInfo {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@NotNull
	@Size(min = 5, max = 200, message = "Address should be between 5-200 chars")
	private String address;
	@NotNull
	@Size(min = 2, max = 40, message = "city between 2-400 chars")
	private String city;
	@NotNull
	@Size(min = 2, max = 40, message = "state between 2-400 chars")
	private String state;
	
	@OneToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="student_id")
	private Student student;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public ContactInfo() {
		super();
	}

	public ContactInfo(
			@NotNull @Size(min = 5, max = 200, message = "Address should be between 5-200 chars") String address,
			@NotNull @Size(min = 2, max = 40, message = "city between 2-400 chars") String city,
			@NotNull @Size(min = 2, max = 40, message = "state between 2-400 chars") String state, Student student) {
		super();
		this.address = address;
		this.city = city;
		this.state = state;
		this.student = student;
	}

	
	

}
