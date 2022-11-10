package com.commerce.presentation.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.commerce.business.model.CategoryModel;
import com.commerce.business.service.CategoryService;

@RestController
@RequestMapping("/commerce/inventory")
public class CategoryResource {
	
	@Autowired
	private CategoryService categoryService;
	
	public CategoryResource(CategoryService categoryService) {
		this.categoryService = categoryService;
	}
	
	@GetMapping("/categories")
	public List<CategoryModel> getCategories() {
		
		List<CategoryModel> categoryList = categoryService.findAllCategories();
		
		return categoryList;
	}

}
