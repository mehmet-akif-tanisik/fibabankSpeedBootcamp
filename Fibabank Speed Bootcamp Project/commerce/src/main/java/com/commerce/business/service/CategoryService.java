package com.commerce.business.service;

import java.util.List;

import com.commerce.business.model.CategoryModel;



public interface CategoryService {

	
	List<CategoryModel> findAllCategories();
	
}
