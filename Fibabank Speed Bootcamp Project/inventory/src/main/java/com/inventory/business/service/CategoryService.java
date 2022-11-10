package com.inventory.business.service;

import java.util.List;

import com.inventory.business.dto.CategoryDto;

public interface CategoryService{
	
	List<CategoryDto> findAllCategories();
}
