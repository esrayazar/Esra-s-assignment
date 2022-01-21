package com.assignments.studentroster.services;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignments.studentroster.models.ContactInfo;
import com.assignments.studentroster.repositories.ContactInfoRepository;

@Service
public class ContactInfoService {
	@Autowired
	private ContactInfoRepository contactRepo;
	
	//Create User 
			public ContactInfo create(ContactInfo newContact) {
				return this.contactRepo.save(newContact);
			}
			
			//Get me all Studentsinfo 
			public List<ContactInfo> getAllStudentsInfo(){
				return this.contactRepo.findAll();
			}
			
		

}
