package com.inventory.data.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Product {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long productId;
	
	private String productName;
	
	private double salesPrice;
	
	@ManyToOne
	@JoinColumn(name = "category_id")
	//@JsonBackReference
	@JsonIgnore
	private Category category;

	public Product() {
	}

	
	public Product(long productId, String productName, double salesPrice, Category category) {
		this.productId = productId;
		this.productName = productName;
		this.salesPrice = salesPrice;
		this.category = category;
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
		return category.getCategoryId();
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	
}
