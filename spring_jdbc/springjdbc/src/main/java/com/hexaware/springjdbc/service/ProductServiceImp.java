package com.hexaware.springjdbc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.springjdbc.dao.IProductDao;
import com.hexaware.springjdbc.model.Product;

@Service
public class ProductServiceImp implements IProductService {

	@Autowired
	IProductDao dao;

	@Override
	public boolean createProduct(Product product) {

		return dao.createProduct(product);
	}

	@Override
	public boolean updateProduct(Product product) {

		return dao.updateProduct(product);
	}

	@Override
	public boolean deleteProductById(int productId) {

		return dao.deleteProductById(productId);
	}

	@Override
	public Product selectProductById(int productId) {

		return dao.selectProductById(productId);
	}

	@Override
	public List<Product> selectAllProducts() {

		return dao.selectAllProducts();
	}

}
