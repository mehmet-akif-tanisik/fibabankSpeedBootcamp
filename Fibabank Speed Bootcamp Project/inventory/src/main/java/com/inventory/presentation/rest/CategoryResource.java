package com.inventory.presentation.rest;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inventory.business.dto.CategoryDto;
import com.inventory.business.service.CategoryService;

@RestController
@RequestMapping("/inventory")
public class CategoryResource {
	
	@Autowired
	private CategoryService categoryService;
	
	public CategoryResource(CategoryService categoryService) {
		this.categoryService = categoryService;
	}
	
	
	@GetMapping("/categories")
	public List<CategoryDto> getCategories() {
		
		List<CategoryDto> categoryList = categoryService.findAllCategories();
		
		return categoryList;
	}

}









