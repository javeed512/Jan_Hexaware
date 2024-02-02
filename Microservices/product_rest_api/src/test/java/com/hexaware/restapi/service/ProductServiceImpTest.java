package com.hexaware.restapi.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.hexaware.restapi.dto.ProductDTO;
import com.hexaware.restapi.entity.Product;

@SpringBootTest
class ProductServiceImpTest {

	@Autowired
	IProductService service;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	void testAddProduct() {

		ProductDTO productDTO = new ProductDTO();
		productDTO.setPname("Pendrive");
		productDTO.setPrice(2200);

		Product product = service.addProduct(productDTO);
		
		
				//assertNotNull(product);
			
				assertEquals("Pendrive", product.getPname());

	}

	@Test
	void testGetById() {

	}

	@Test
	void testGetAllProducts() {

	}

}
