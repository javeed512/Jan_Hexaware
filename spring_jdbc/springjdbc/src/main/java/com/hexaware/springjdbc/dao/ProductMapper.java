package com.hexaware.springjdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.hexaware.springjdbc.model.Product;

public class ProductMapper implements RowMapper<Product> {

	@Override
	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {

		Product product = new Product();

		product.setProductId(rs.getInt("pid"));
		product.setProductName(rs.getString("pname"));
		product.setPrice(rs.getDouble("price"));

		return product;
	}

}
