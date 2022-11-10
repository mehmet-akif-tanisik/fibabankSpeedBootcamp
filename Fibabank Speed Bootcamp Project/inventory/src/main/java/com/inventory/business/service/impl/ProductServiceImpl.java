package com.inventory.business.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventory.business.dto.ProductDto;
import com.inventory.business.service.ProductService;
import com.inventory.data.entity.Product;
import com.inventory.data.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	public ProductServiceImpl(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}


	@Override
	public List<ProductDto> findAllProductsByCategoryId(long categoryId) {
		List<ProductDto> productDtos = new ArrayList<>();
		Iterable<Product> products = productRepository.findByCategoryId(categoryId);
		
		for(Product product: products) {
			ProductDto productDto = new ProductDto(product);
			productDtos.add(productDto);
		}
		return productDtos;
	}

	@Override
	public ProductDto findProductById(long productId) {
		Optional<Product> optional = productRepository.findById(productId);
		Product product = optional.get();
		
		ProductDto productDto = new ProductDto(product);
		return productDto;
	}
	
	

	
	

}
