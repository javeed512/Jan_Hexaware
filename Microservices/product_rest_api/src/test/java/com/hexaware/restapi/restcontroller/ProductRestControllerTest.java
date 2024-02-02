package com.hexaware.restapi.restcontroller;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.hexaware.restapi.dto.ProductDTO;
import com.hexaware.restapi.entity.Product;

@SpringBootTest
class ProductRestControllerTest {

	@Autowired
	RestTemplate restTemplate;

	Logger logger = LoggerFactory.getLogger(ProductRestControllerTest.class);

	String baseURL = "http://localhost:8282/api/products";

	@Test
	void testAddProduct() {

		ProductDTO productDTO = new ProductDTO();
		productDTO.setPname("Car");
		productDTO.setPrice(99000);

		Product product = restTemplate.postForObject(baseURL + "/add", productDTO, Product.class);
		
							

		logger.info("Product Added: " + product);

		assertNotNull(product);
	
		

	}

	@Test
	void testGetById() {

		int pid = 1;

		ResponseEntity<Product> response = restTemplate.getForEntity("http://localhost:8282/api/products/get/" + pid,
				Product.class);

		Product product = response.getBody();

		logger.info("Product : " + product);
		logger.info(response.getStatusCode().toString());
		logger.info("Response : " + response);

		assertTrue(product.getPid() > 0);

		Product product2 = restTemplate.getForObject("http://localhost:8282/api/products/get/" + pid, Product.class);

		assertNotNull(product2);

		logger.info(product2.toString());
	}

	@Test
	void testGetAllProducts() {

		List<Product> list = restTemplate.getForObject(baseURL + "/getall", List.class);

		logger.info("List of Products : " + list);

		assertNotNull(list);

	}

}
