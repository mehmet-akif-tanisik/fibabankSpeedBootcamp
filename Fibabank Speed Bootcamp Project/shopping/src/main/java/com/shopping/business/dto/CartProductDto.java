package com.shopping.business.dto;

import com.shopping.data.entity.CartProduct;

public class CartProductDto {
	
	
private long cartProductId;
	
	private int salesQuantity;
	
	private long productId;
	
	private double salesPrice;
	
	private double lineAmount;
	
	private long cartId;
	
	public CartProductDto() {}

	public CartProductDto(long cartProductId, int salesQuantity, long productId, double salesPrice, double lineAmount,
			long cartId) {
		this.cartProductId = cartProductId;
		this.salesQuantity = salesQuantity;
		this.productId = productId;
		this.salesPrice = salesPrice;
		this.lineAmount = lineAmount;
		this.cartId = cartId;
	}
	
	public CartProductDto(CartProduct entity) {
		this.cartProductId = entity.getCartProductId();
		this.salesQuantity = entity.getSalesQuantity();
		this.productId = entity.getProductId();
		this.salesPrice = entity.getSalesPrice();
		this.lineAmount = entity.getLineAmount();
		this.cartId = entity.getCartId();
	}

	public long getCartProductId() {
		return cartProductId;
	}

	public void setCartProductId(long cartProductId) {
		this.cartProductId = cartProductId;
	}

	public int getSalesQuantity() {
		return salesQuantity;
	}

	public void setSalesQuantity(int salesQuantity) {
		this.salesQuantity = salesQuantity;
	}

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public double getSalesPrice() {
		return salesPrice;
	}

	public void setSalesPrice(double salesPrice) {
		this.salesPrice = salesPrice;
	}

	public double getLineAmount() {
		return lineAmount;
	}

	public void setLineAmount(double lineAmount) {
		this.lineAmount = lineAmount;
	}

	public long getCartId() {
		return cartId;
	}

	public void setCartId(long cartId) {
		this.cartId = cartId;
	}
	

}
