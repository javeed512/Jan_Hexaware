package com.hexaware.customerapi.dto;

public class CustomerProductVO {
	
	private  CustomerDTO customer;
	private  Product product;
	

	public CustomerProductVO() {
		
		
	}
	
	
	public CustomerProductVO(CustomerDTO customer, Product product) {
		super();
		this.customer = customer;
		this.product = product;
	}


	public CustomerDTO getCustomer() {
		return customer;
	}


	public void setCustomer(CustomerDTO customer) {
		this.customer = customer;
	}


	public Product getProduct() {
		return product;
	}


	public void setProduct(Product product) {
		this.product = product;
	}
	
	
	
	

}
