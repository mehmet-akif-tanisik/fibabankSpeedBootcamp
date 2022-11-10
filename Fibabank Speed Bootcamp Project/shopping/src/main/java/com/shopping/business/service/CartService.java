package com.shopping.business.service;

import com.shopping.business.dto.CartDto;

public interface CartService {

	void delete(long cartId,long cartProductId);
	
	public CartDto find(long cartId);
	
}
