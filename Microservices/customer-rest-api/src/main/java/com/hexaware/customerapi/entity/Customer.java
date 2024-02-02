package com.hexaware.customerapi.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "customer_info")
public class Customer {

		@Id
	private int customerId;
	private String customerName;
	private LocalDate dateOfBirth;

	private int productId;

	public Customer() {
		super();
	}

	public Customer(int customerId, String customerName, LocalDate dateOfBirth, int productId) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.dateOfBirth = dateOfBirth;
		this.productId = productId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

}
