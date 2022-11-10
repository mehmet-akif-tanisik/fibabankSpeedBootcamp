package com.shopping.business.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.business.dto.CartProductDto;
import com.shopping.business.service.CartProductService;
import com.shopping.data.entity.CartProduct;
import com.shopping.data.repository.CartProductRepository;

@Service
public class CartProductServiceImpl implements CartProductService{

	@Autowired
	private CartProductRepository cartProductRepository;
	
	public CartProductServiceImpl(CartProductRepository cartProductRepository) {
		this.cartProductRepository = cartProductRepository;
	}
	
	
	public CartProductDto find(long cartProductId) {
		Optional<CartProduct> optional = cartProductRepository.findById(cartProductId);
		CartProduct cartProduct = optional.get();
		
		CartProductDto cartProductDto = new CartProductDto(cartProduct);
		return cartProductDto;
	}
	
	
}
