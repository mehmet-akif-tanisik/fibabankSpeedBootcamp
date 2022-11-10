package com.matnsk.spring.client;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.matnsk.spring.Product;

@Controller
public class ProductController {
	
	@GetMapping("/product/get")
	@ResponseBody
	public String getProduct() {
		long productId = 301;
		String url = "http://localhost:8080/api/product/" + productId;
		
		RestTemplate restTemplate = new RestTemplate();
		Product  product= restTemplate.getForObject(url, Product.class);
		
		System.out.println("Ürün: " + product.getProductName());
		return "Get succesfully";
	}
	
	@GetMapping("/product/post")
	@ResponseBody
	public String postProduct() {
		Product product = new Product(0,"fritöz",540);
		String url = "http://localhost:8080/api/product";
		
		RestTemplate restTemplate = new RestTemplate();
		Product result = restTemplate.postForObject(url,product, Product.class);
		
		return "Post succesfully" + result.getProductID();
	}
	
	
	@GetMapping("/product/put")
	@ResponseBody
	public String putProduct() {
		Product product = new Product(302,"masa",1111);
		String url = "http://localhost:8080/api/product";
		
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.exchange(url,HttpMethod.PUT, new HttpEntity<Product>(product), Void.class);
		
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






























