package com.hexaware.mappings;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.mappings.entity.Order;
import com.hexaware.mappings.entity.Product;

public class ManyToManyMapping {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();
		

		Transaction txn =		session.beginTransaction();
		
		Product p1 = new Product();
		p1.setProductId(51);
		p1.setProductName("Toys");

		Product p2 = new Product();
		p2.setProductId(52);
		p2.setProductName("Books");

		Product p3 = new Product();
		p3.setProductId(53);
		p3.setProductName("Clothes");

		Order order1 = new Order();
		order1.setOrderId(200);
		order1.setPurchaseDate(LocalDate.now());
		
			order1.addProduct(p1);  order1.addProduct(p3);
		
		
		
		Order order2 = new Order();
		order2.setOrderId(300);
		order2.setPurchaseDate(LocalDate.now());

		order2.addProduct(p1); order2.addProduct(p2);  order2.addProduct(p3);
		
			session.persist(order1);
			session.persist(order2);
			
			txn.commit();
			
			session.close();
		
	}

}
