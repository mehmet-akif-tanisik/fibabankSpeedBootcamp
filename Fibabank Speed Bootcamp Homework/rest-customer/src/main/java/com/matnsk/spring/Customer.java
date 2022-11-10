package com.matnsk.spring;

public class Customer {
	
	private long customerId;
	private String customerName;
	private double totalDebit;
	
	public Customer() {
	}
	
	public Customer(long customerId, String customerName, double totalDebit) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.totalDebit = totalDebit;
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public double getTotalDebit() {
		return totalDebit;
	}

	public void setTotalDebit(double totalDebit) {
		this.totalDebit = totalDebit;
	}
	
	

}
