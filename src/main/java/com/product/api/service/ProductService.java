package com.product.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.product.api.entity.Product;
import com.product.api.repository.ProductRepository;

public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public Product saveProduct(Product product) {
		 return productRepository.save(product);
	}
	
	public List<Product> saveProducts(List<Product> products){
		return productRepository.saveAll(products);
	}
	
	public List<Product> getAllProducts(){
		return productRepository.findAll();
	}

	public Product getProductById(int id) {
		return productRepository.findById(id).orElse(null);
	}
	
	public Product getProductByName(String name) {
		return productRepository.findByName(name);
	}
}
