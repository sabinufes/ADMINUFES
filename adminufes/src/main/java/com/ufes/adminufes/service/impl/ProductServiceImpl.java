package com.ufes.adminufes.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ufes.adminufes.domain.Product;
import com.ufes.adminufes.repository.ProductRepository;
import com.ufes.adminufes.service.ProductService;




@Service
public class ProductServiceImpl implements ProductService {

	
	@Autowired
	private ProductRepository productRepository;
	
	
	public Product save(Product product) {
		
		return productRepository.save(product);
	}
	
	public List<Product> findAll(){
		return  (List<Product>) productRepository.findAll();
	}
}
