package com.inventory.data.repository;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.inventory.data.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Long>{
	
	@Query("select p from Product p where p.category.categoryId = :categoryId")
	List<Product> findByCategoryId(long categoryId);
}
