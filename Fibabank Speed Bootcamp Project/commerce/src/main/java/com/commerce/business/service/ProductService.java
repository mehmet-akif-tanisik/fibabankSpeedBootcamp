package com.commerce.business.service;

import java.util.List;

import com.commerce.business.model.ProductModel;

public interface ProductService {

	public ProductModel findProductById(long productId);
	
	public List<ProductModel> findAllProductsByCategoryId(long categoryId);
	
}
