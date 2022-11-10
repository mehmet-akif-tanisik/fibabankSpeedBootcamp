package com.matnsk.spring.presentation.client;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.matnsk.spring.business.dto.ProductDto;




@Controller
public class ProductClient {
	
	@GetMapping("/product/get")
	@ResponseBody
	public String getProduct() {
		long productId = 301;
		String url = "http://localhost:8080/api/product/" + productId;
		
		RestTemplate restTemplate = new RestTemplate();
		ProductDto  productDto= restTemplate.getForObject(url, ProductDto.class);
		
		System.out.println("Ürün: " + productDto.getProductName());
		return "Get succesfully";
	}
	
	@GetMapping("/product/post")
	@ResponseBody
	public String postProduct() {
		ProductDto productDto = new ProductDto(0,"fritöz",540);
		String url = "http://localhost:8080/api/product";
		
		RestTemplate restTemplate = new RestTemplate();
		ProductDto result = restTemplate.postForObject(url,productDto, ProductDto.class);
		
		return "Post succesfully" + result.getProductId();
	}
	
	
	@GetMapping("/product/put")
	@ResponseBody
	public String putProduct() {
		ProductDto productDto = new ProductDto(302,"masa",1111);
		String url = "http://localhost:8080/api/product";
		
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.exchange(url,HttpMethod.PUT, new HttpEntity<ProductDto>(productDto), Void.class);
		
		return "PUT succesfully";
	}
	
	@GetMapping("/product/delete")
	@ResponseBody
	public String deleteProduct() {
		long productId = 303;
		String url = "http://localhost:8080/api/product/" + productId;
		
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.delete(url);
		
		return "DELETE succesfully";
	}
	
	
	
 	
	
	
	
	
	

}






























