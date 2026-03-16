package com.example.Ecom.service;

import java.util.List;

import com.example.Ecom.entity.Category;

public interface CategoryService {
	
	Category addCategory(Category category);
    List<Category> getAllCategories();

}
