package com.shopping.presentation.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.business.dto.CartProductDto;
import com.shopping.business.service.CartProductService;

@RestController
@RequestMapping("/shopping")
public class CartProductResource {

	@Autowired
	private CartProductService cartProductService;
	
	
	public CartProductResource(CartProductService cartProductService) {
		this.cartProductService = cartProductService;
	}
	
	@GetMapping("/cartproduct/{id}")
	public CartProductDto getCartProduct(@PathVariable("id")long cartProductId) {
		CartProductDto cartProductDto = cartProductService.find(cartProductId);
		
		return cartProductDto;
	}
	
	
	
}
