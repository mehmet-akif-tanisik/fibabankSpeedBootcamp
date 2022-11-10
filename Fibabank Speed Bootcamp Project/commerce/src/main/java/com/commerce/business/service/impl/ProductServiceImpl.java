package com.commerce.business.service.impl;

import java.util.ArrayList;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.commerce.business.model.ProductModel;
import com.commerce.business.service.ProductService;
import com.commerce.data.component.ProductComponent;
import com.commerce.data.component.dto.ProductDto;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductComponent productComponent;
	
	public ProductServiceImpl(ProductComponent productComponent) {
		this.productComponent = productComponent;
	}
	
	
	
	public ProductModel findProductById(long productId) {
		
		ProductDto productDto = productComponent.findProductById(productId);
		
		ProductModel productModel = new ProductModel(productDto);
		
		return productModel;
	}
	
	public List<ProductModel> findAllProductsByCategoryId(long categoryId){
		
		List<ProductModel> productModels = new ArrayList<>();
		
		List<ProductDto> productDtos = productComponent.findAllProductsByCategoryId(categoryId);
		
		
		for(ProductDto productDto: productDtos) {
			ProductModel productModel = new ProductModel(productDto);
			productModels.add(productModel);
		}
		return productModels;
	}

	
	
	
	
}
