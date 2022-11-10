package com.matnsk.spring.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.matnsk.spring.Product;


@Service
public class ProductServiceImpl implements ProductService{

	@Override
	public Product find(long productId) {
		
		Product product = new Product(productId,"Cep telefonu",1450);
		System.out.println("find çalıştı.");
		return product;
	}

	@Override
	public List<Product> findAll() {
		List<Product> productList = new ArrayList<>();
		productList.add(new Product(100,"Telefon",2500));
		productList.add(new Product(101,"Laptop",3000));
		productList.add(new Product(102,"Tablet",1000));
		
		return productList;
	}

	@Override
	public void createProduct(Product product) {
		product.setProductID(301);
		System.out.println("Ürün eklendi " + product.getProductID() + " " + product.getProductName() + " " +
	product.getSalesPrice());
		
	}

	@Override
	public void updateProduct(Product product) {
		System.out.println("Ürün güncellendi " + product.getProductID() + " " + product.getProductName() + " " +
				product.getSalesPrice());
	}

	@Override
	public void deleteProduct(long productId) {
		System.out.println("Ürün silindi " + productId);
	}
	
	
	
	
	

}
