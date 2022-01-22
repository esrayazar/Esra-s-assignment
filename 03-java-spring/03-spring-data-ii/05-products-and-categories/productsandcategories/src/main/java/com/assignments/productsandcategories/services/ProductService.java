package com.assignments.productsandcategories.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignments.productsandcategories.models.Category;
import com.assignments.productsandcategories.models.Product;
import com.assignments.productsandcategories.repositories.CategoryRepository;
import com.assignments.productsandcategories.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepo;
	@Autowired
	private CategoryRepository categoryRepo;
	
	
	//Get me all Students
	public List<Product> getAllProducts(){
		return this.productRepo.findAll();
	}
	
	//create product
	public Product create(Product product) {
		return this.productRepo.save(product);
	}
	
	//find one product
	public Product findById(Long productId) {
		return productRepo.findById(productId).orElse(null);
	}
//	//Find missing
//	public List<Product> findProductNotInList(Category category){
//		return productRepo.fi
//	}
	
	public void addCategoryToProduct(Long categoryId, Long productId){
		Product product = this.findById(productId);
		Category category = categoryRepo.findById(categoryId).get();
		product.getCategories().add(category);
		productRepo.save(product);
			
		}
	public List<Product> findAll(){
		return this.productRepo.findAll();
	}
	
	

}
