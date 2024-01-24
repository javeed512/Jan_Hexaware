package com.hexaware.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;



public class HibernateUtil {

	private static final SessionFactory sessionFactory;

	static {

		StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder()
				.configure("hibernate.cfg.xml")
				.build();

		Metadata metaData = new MetadataSources(standardRegistry).getMetadataBuilder().build();

		sessionFactory = metaData.getSessionFactoryBuilder().build();

	}
	
	
	
	public static SessionFactory getSessionFactory() {
		
			return sessionFactory;
		
	}
	
	

}
