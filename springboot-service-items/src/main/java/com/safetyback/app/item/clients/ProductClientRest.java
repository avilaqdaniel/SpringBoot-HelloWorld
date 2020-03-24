package com.safetyback.app.item.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.safetyback.app.item.models.Product;

@FeignClient(name = "service-products")
public interface ProductClientRest {
	
	@GetMapping("/products")
	public List<Product> list();

	@GetMapping("/product/{id}")
	public Product detail(@PathVariable Long id);
}
