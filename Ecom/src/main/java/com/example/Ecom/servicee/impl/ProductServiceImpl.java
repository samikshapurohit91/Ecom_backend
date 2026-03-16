package com.example.Ecom.servicee.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Ecom.Repository.ProductRepository;
import com.example.Ecom.entity.Product;
import com.example.Ecom.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
	
	 @Autowired
	    private ProductRepository productRepository;

	    @Override
	    public Product addProduct(Product product) {
	        return productRepository.save(product);
	    }

	    @Override
	    public List<Product> getAllProducts() {
	        return productRepository.findAll();
	    }

}
