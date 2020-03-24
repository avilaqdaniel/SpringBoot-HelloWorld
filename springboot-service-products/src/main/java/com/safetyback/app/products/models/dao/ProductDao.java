package com.safetyback.app.products.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.safetyback.app.products.models.entity.Product;

public interface ProductDao extends CrudRepository<Product, Long>{

	
}
