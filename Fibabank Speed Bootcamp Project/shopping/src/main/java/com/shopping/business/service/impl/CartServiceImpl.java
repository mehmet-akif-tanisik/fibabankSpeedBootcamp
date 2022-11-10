package com.shopping.business.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.business.dto.CartDto;
import com.shopping.business.service.CartService;
import com.shopping.data.entity.Cart;
import com.shopping.data.entity.CartProduct;
import com.shopping.data.repository.CartRepository;

@Service
public class CartServiceImpl implements CartService {
	
	@Autowired
	private CartRepository cartRepository;
	
	public CartServiceImpl(CartRepository cartRepository) {
		this.cartRepository = cartRepository;
	}
	
	
	public CartDto find(long cartId) {
		Optional<Cart> optional = cartRepository.findById(cartId);
		Cart cart = optional.get();
		
		CartDto cartDto = new CartDto(cart);
		return cartDto;
	}



	@Override
	public void delete(long cartId, long cartProductId) {
		
		Optional<Cart> optional = cartRepository.findById(cartId);
		Cart cart = optional.get();
		
		List<CartProduct> cartProducts = cart.getCartProductList();
		for(CartProduct p: cartProducts) {
			if(p.getProductId()==cartProductId) {
				cartProducts.remove(p);
			}
		}
		
	}


	
	
	
	

}
