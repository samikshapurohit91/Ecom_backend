package com.example.Ecom.service;

import java.util.List;

import com.example.Ecom.entity.Product;

public interface ProductService {
	
	Product addProduct(Product product);

    List<Product> getAllProducts();

}
