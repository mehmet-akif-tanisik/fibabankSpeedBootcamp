package com.commerce.data.component;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.commerce.data.component.dto.ProductDto;

@Component
public class ProductComponent {

	
	public ProductDto findProductById(long productId) {
		String url = "http://localhost:8081/inventory/product/" + productId;
		RestTemplate restTemplate = new RestTemplate();
		ProductDto productDto = restTemplate.getForObject(url, ProductDto.class);
		return productDto;
	}
	
	public List<ProductDto> findAllProductsByCategoryId(long categoryId){
		String url = "http://localhost:8081/inventory/products/" + categoryId;
		RestTemplate restTemplate = new RestTemplate();
		
		ResponseEntity<ProductDto[]> responseEntity = 
			    restTemplate.getForEntity(url, ProductDto[].class); 
		
		ProductDto[] productDtoArray = responseEntity.getBody();
		
		return Arrays.stream(productDtoArray).collect(Collectors.toList());
	}

	
	
}
