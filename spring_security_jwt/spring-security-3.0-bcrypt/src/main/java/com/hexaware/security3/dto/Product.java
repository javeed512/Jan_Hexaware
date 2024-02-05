package com.hexaware.security3.dto;

public class Product {

    private int productId;
    private String name;
    private int qty;
    private double price;
    
    
    
    
    
	public Product(int productId, String name, int qty, double price) {
		super();
		this.productId = productId;
		this.name = name;
		this.qty = qty;
		this.price = price;
	}
	public int getProductId() {
		return productId;
	}
	public String getName() {
		return name;
	}
	public int getQty() {
		return qty;
	}
	public double getPrice() {
		return price;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public void setPrice(double price) {
		this.price = price;
	}
    
    
    
    
}
