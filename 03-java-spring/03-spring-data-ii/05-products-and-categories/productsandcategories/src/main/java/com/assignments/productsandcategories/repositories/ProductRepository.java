package com.assignments.productsandcategories.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.assignments.productsandcategories.models.Product;


@Repository
public interface ProductRepository extends CrudRepository <Product, Long> {

//	Get list of Users 
	List<Product> findAll();
	
//	List<Product> findByCategoriesNotContains(Category category);
	
}
