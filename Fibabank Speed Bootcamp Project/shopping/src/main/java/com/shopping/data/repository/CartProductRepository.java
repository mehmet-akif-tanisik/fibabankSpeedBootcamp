package com.shopping.data.repository;

import org.springframework.data.repository.CrudRepository;

import com.shopping.data.entity.CartProduct;

public interface CartProductRepository extends CrudRepository<CartProduct, Long>{


	
}
