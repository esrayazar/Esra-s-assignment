package com.assignments.productsandcategories.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.assignments.productsandcategories.models.Category;
import com.assignments.productsandcategories.models.Product;
import com.assignments.productsandcategories.services.CategoryService;
import com.assignments.productsandcategories.services.ProductService;

@Controller
public class HomeController {
	@Autowired
	private ProductService productService;
	@Autowired
	private CategoryService categoryService;

	
	@GetMapping("/")
	public String dashboard(Model model) {
		model.addAttribute("Products",this.productService.getAllProducts());
		return "homepage.jsp";
	}
	@GetMapping("/products/new")
	public String newProduct(@ModelAttribute ("product") Product product){
		return "newproduct.jsp";
	}
	
	@PostMapping("/products/new")
	public String createProduct(@ModelAttribute("product") Product product) {
		this.productService.create(product);
		return "redirect:/";
	}
	
	@GetMapping("/categories/new")
	public String newCategory(@ModelAttribute ("category") Category category){
		return "newcategory.jsp";
	}
	
	@PostMapping("/categories/new")
	public String createCategory(@ModelAttribute ("category") Category category){
		this.categoryService.create(category);
		return "redirect:/";
	}
	
	
	@GetMapping ("/categories/{id}")
	public String addProductToCategory(@PathVariable("id") Long id, Model model) {
		model.addAttribute("category",categoryService.findById(id));
		model.addAttribute("products", productService.getAllProducts());
		//model.addAttribute("ListOfCategory", categoryService.findAll());
		return "categorydisplay.jsp";
	}
	
	@PostMapping("/categories/{id}")
	public String createProduct( @PathVariable ("id") Long categoryId, Model model, @RequestParam("product") Long productId ) {
		categoryService.addProductToCategory(productId,categoryId);
		return "redirect:/categories/{id}";
	}
	
	@GetMapping("/products/{id}")
	public String addCategoryToProduct(@PathVariable("id") Long productId, Model model) {
		model.addAttribute("product",productService.findById(productId));
		model.addAttribute("categories", categoryService.findAll());
		return "productdisplay.jsp";
	}
	@PostMapping("/products/{id}")
	public String createCategory( @PathVariable ("id") Long productId, Model model, @RequestParam("category") Long categoryId ) {
		productService.addCategoryToProduct(categoryId,productId);
		return "redirect:/products/{id}";
	}

}
