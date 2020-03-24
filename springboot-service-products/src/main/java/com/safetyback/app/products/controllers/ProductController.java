package com.safetyback.app.products.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.safetyback.app.products.models.entity.Product;
import com.safetyback.app.products.models.service.IProductService;

@RestController
public class ProductController {

	@Autowired
	private IProductService productoService;
	
	@GetMapping("/products")
	public List<Product> list(){
		return productoService.findAll();
	}
	
	@GetMapping("/product/{id}")
	public Product detail(@PathVariable Long id) {
		return productoService.findById(id);
	}
}
