package com.commerce.presentation.rest;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.commerce.business.model.ProductModel;
import com.commerce.business.service.ProductService;

@RestController
@RequestMapping("/commerce/inventory")
public class ProductResource {

	@Autowired
	private ProductService productService;
	
	
	public ProductResource(ProductService productService) {
		this.productService = productService;
	}
	
	@GetMapping("/product/{id}")
	public ProductModel getProduct(@PathVariable("id")long productId) {
		
		ProductModel product = productService.findProductById(productId);
		return product;
	}
	
	@GetMapping("/products/{categoryId}")
	public List<ProductModel> getProducts(@PathVariable("categoryId")long categoryId) {
		
		List<ProductModel> productList = productService.findAllProductsByCategoryId(categoryId);
		
		return productList;
	}

	 
	
	
}

