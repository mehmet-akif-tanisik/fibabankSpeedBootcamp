package com.shopping.presentation.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.business.dto.CartDto;
import com.shopping.business.service.CartService;

@RestController
@RequestMapping("/shopping")
public class CartResource {

	
	@Autowired
	private CartService cartService;
	
	public CartResource(CartService cartService) {
		this.cartService = cartService;
	}
	
	
	@GetMapping("/cart/{id}")
	public CartDto getCart(@PathVariable("id")long cartId) {
		CartDto cartDto = cartService.find(cartId);
		
		return cartDto;
	}
	
	@GetMapping("/cart/{cartId}/remove/{productId}")
	public void delete(@PathVariable("cartId")long cartId,
			@PathVariable("productId")long productId) {
		
		cartService.delete(cartId, productId);
	}
	
	
	
}
