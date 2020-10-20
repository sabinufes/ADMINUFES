package com.ufes.adminufes.service;

import java.util.List;

import com.ufes.adminufes.domain.Product;



public interface ProductService {
	
	
	Product save(Product product);
    List<Product> findAll();
    Product findById(Long id);
}
