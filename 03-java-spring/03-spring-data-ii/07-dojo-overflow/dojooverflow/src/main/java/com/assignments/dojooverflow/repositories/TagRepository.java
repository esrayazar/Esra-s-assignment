package com.assignments.dojooverflow.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.assignments.dojooverflow.models.Tag;

public interface TagRepository extends CrudRepository <Tag, Long>{
	List <Tag> findAll();

}
