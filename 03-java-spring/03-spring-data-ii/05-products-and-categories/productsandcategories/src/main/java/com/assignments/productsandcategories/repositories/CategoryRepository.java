package com.assignments.productsandcategories.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.assignments.productsandcategories.models.Category;


@Repository
public interface CategoryRepository extends CrudRepository <Category, Long> {

//	Get list of Users 
	List<Category> findAll();
}
