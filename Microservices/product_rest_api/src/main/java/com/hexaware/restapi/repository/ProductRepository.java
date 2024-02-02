package com.hexaware.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hexaware.restapi.entity.Product;

@Repository
public interface ProductRepository  extends JpaRepository<Product, Integer> {

}
