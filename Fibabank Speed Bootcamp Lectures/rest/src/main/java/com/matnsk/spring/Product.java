package com.matnsk.spring;

public class Product {
	
	private long productID;
	
	private String productName;
	
	private double salesPrice;
	
	public Product() {	
	}
	
	public Product(long productID, String productName, double salesPrice) {
		this.productID = productID;
		this.productName = productName;
		this.salesPrice = salesPrice;
	}

	public long getProductID() {
		return productID;
	}

	public void setProductID(long productID) {
		this.productID = productID;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getSalesPrice() {
		return salesPrice;
	}

	public void setSalesPrice(double salesPrice) {
		this.salesPrice = salesPrice;
	}
	
	

}
