package com.assignments.productsandcategories.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignments.productsandcategories.models.Category;
import com.assignments.productsandcategories.models.Product;
import com.assignments.productsandcategories.repositories.CategoryRepository;
import com.assignments.productsandcategories.repositories.ProductRepository;


@Service
public class CategoryService {
	@Autowired
	private CategoryRepository categoryrepo;
	@Autowired
	private ProductRepository productrepo;
	
	//Get me all category
	public List<Category> getAllProducts(){
		return this.categoryrepo.findAll();
	}
	
	//create product
		public Category create(Category category) {
			return this.categoryrepo.save(category);
		}
	
	public Category findById(Long CategoryId) {
		return categoryrepo.findById(CategoryId).orElse(null);
	}
	
	public void addProductToCategory(Long productId, Long categoryId) {
		Category category = this.findById(categoryId);
		Product product = productrepo.findById(productId).get();
		category.getProducts().add(product);
		categoryrepo.save(category);
		}

	public List<Category> findAll() {
		return this.categoryrepo.findAll();
	}
	

}
