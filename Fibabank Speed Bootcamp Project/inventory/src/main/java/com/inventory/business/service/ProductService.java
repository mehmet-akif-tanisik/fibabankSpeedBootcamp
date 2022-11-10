package com.inventory.business.service;

import java.util.List;


import com.inventory.business.dto.ProductDto;

public interface ProductService{
	
	List<ProductDto> findAllProductsByCategoryId(long categoryId);
	
	
	ProductDto findProductById(long productId);
	
}
