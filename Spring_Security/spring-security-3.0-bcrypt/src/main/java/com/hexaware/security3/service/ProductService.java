package com.hexaware.security3.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.hexaware.security3.dto.Product;
import com.hexaware.security3.entity.UserInfo;
import com.hexaware.security3.repository.UserInfoRepository;

@Service
public class ProductService {

    List<Product> productList = new ArrayList<>();

    
	
	/*
	 * @PostConstruct public void loadProductsFromDB() { productList =
	 * IntStream.rangeClosed(1, 100) .mapToObj(i -> Product.builder() .productId(i)
	 * .name("product " + i) .qty(new Random().nextInt(10)) .price(new
	 * Random().nextInt(5000)).build() ).collect(Collectors.toList()); }
	 * 
	 */

    public List<Product> getProducts() {
    	
    	productList.add( new Product(201, "Mobile", 1, 20000) );
    	productList.add( new Product(202, "Laptop", 1, 50000) );
    	productList.add( new Product(203, "Charger", 2, 1200) );
    	productList.add( new Product(204, "Power bank", 4, 8000) );
    	
    	
        return  productList;
    }

    public Product getProduct(int id) {
        return productList.stream()
                .filter(product -> product.getProductId() == id)
                .findAny()
                .orElseThrow(() -> new RuntimeException("product " + id + " not found"));
    }


    
}
