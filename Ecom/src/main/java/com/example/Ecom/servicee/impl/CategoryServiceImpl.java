package com.example.Ecom.servicee.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Ecom.Repository.CategoryRepository;
import com.example.Ecom.entity.Category;
import com.example.Ecom.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

	
	@Autowired
    private CategoryRepository categoryRepository;

    @Override
    public Category addCategory(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }
}
