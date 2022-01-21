package com.assignments.productsandcategories.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.assignments.productsandcategories.models.Product;



public interface ProductRepository extends CrudRepository <Product, Long> {

//	Get list of Users 
	List<Product> findAll();
}
