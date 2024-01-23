package com.hexaware.springjdbc.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hexaware.springjdbc.model.Product;

@Repository
public class ProductDaoImp implements IProductDao {

	JdbcTemplate jdbcTemplate;

	@Autowired
	public ProductDaoImp(DataSource datasource) {

		jdbcTemplate = new JdbcTemplate(datasource);

		System.out.println(jdbcTemplate);

	}

	@Override
	public boolean createProduct(Product product) {

		String insertQuery = "insert into Products(pid,pname,price) values(?,?,?)";

		int count = jdbcTemplate.update(insertQuery, product.getProductId(), product.getProductName(),
				product.getPrice());

		return count > 0;
	}

	@Override
	public boolean updateProduct(Product product) {

		String updateQuery = "update products set pname = ? , price = ?  where pid = ?";

		int count = jdbcTemplate.update(updateQuery, product.getProductName(), product.getPrice(),
				product.getProductId());

		return count > 0;
	}

	@Override
	public boolean deleteProductById(int productId) {

		String deleteQuery = "delete from products  where pid = ?";

		int count = jdbcTemplate.update(deleteQuery, productId);

		return count > 0;
	}

	@Override
	public Product selectProductById(int productId) {

		String selectQueryById = "select pid,pname,price from products where pid = ?";

		Product product = jdbcTemplate.queryForObject(selectQueryById, new ProductMapper(), productId);

		return product;
	}

	@Override
	public List<Product> selectAllProducts() {

		String selectQuery = "select pid,pname,price from products";

		List<Product> list = jdbcTemplate.query(selectQuery, new ProductMapper());

		return list;
	}

}
