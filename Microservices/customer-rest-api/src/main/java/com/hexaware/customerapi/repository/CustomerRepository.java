package com.hexaware.customerapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexaware.customerapi.entity.Customer;

public interface CustomerRepository  extends JpaRepository<Customer, Integer>{

}
