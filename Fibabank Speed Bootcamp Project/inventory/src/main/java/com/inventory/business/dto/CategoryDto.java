package com.inventory.business.dto;

import com.inventory.data.entity.Category;



public class CategoryDto {
	
	private long categoryId;
	
	private String categoryName;
	
	public CategoryDto() {
		
	}

	public CategoryDto(long categoryId, String categoryName) {
		this.categoryId = categoryId;
		this.categoryName = categoryName;
	}
	
	public CategoryDto(Category entity) {
		this.categoryId = entity.getCategoryId();
		this.categoryName = entity.getCategoryName();
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