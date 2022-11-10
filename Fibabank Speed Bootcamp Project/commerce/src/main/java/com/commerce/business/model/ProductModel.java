package com.commerce.business.model;

import com.commerce.data.component.dto.ProductDto;

public class ProductModel {

	private long productId;
	
	private String productName;
	
	private double salesPrice;
	
	private long categoryId;

	public ProductModel() {
	}

	public ProductModel(long productId, String productName, double salesPrice, long categoryId) {
		this.productId = productId;
		this.productName = productName;
		this.salesPrice = salesPrice;
		this.categoryId = categoryId;
	}
	
	public ProductModel(ProductDto productDto) {
		this.productId = productDto.getProductId();
		this.productName = productDto.getProductName();
		this.salesPrice = productDto.getSalesPrice();
		this.categoryId = productDto.getCategoryId();
	}

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getSalesPrice() {
		return salesPrice;
	}

	public void setSalesPrice(double salesPrice) {
		this.salesPrice = salesPrice;
	}

	public long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
	}
	
	
	
}
