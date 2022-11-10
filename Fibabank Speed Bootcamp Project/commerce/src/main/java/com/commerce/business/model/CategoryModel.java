package com.commerce.business.model;

import com.commerce.data.component.dto.CategoryDto;

public class CategoryModel {
	
	private long categoryId;
	
	private String categoryName;

	public CategoryModel() {
	}

	public CategoryModel(long categoryId, String categoryName) {
		this.categoryId = categoryId;
		this.categoryName = categoryName;
	}
	
	public CategoryModel(CategoryDto categoryDto) {
		this.categoryId = categoryDto.getCategoryId();
		this.categoryName = categoryDto.getCategoryName();
	}

	public long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
	
	

}
