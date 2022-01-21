package com.assignments.productsandcategories.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.assignments.productsandcategories.models.Product;
import com.assignments.productsandcategories.services.ProductService;

@Controller
public class HomeController {
	@Autowired
	private ProductService productService;
	
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

}
