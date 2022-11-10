package com.inventory.business.service.impl;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventory.business.dto.CategoryDto;
import com.inventory.business.service.CategoryService;
import com.inventory.data.entity.Category;
import com.inventory.data.repository.CategoryRepository;


@Service
public class CategoryServiceImpl implements CategoryService{

	@Autowired
	private CategoryRepository categoryRepository;
	
	
	public CategoryServiceImpl(CategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}


	@Override
	public List<CategoryDto> findAllCategories() {
		List<CategoryDto> categoryDtos = new ArrayList<>();
		Iterable<Category> categories = categoryRepository.findAll();
		
		for(Category category: categories) {
			CategoryDto categoryDto = new CategoryDto(category);
			categoryDtos.add(categoryDto);
		}
		return categoryDtos;
	}
	


}


