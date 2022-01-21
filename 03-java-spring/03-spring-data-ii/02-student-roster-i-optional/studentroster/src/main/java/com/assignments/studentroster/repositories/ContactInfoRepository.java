package com.assignments.studentroster.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.assignments.studentroster.models.ContactInfo;

@Repository
public interface ContactInfoRepository extends CrudRepository<ContactInfo, Long> {
//	Get list of Users 
	List<ContactInfo> findAll();


}
