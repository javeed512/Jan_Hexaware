package com.hexaware.springbootweb.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


@Configuration
@PropertySource("classpath:application.properties")
public class AppConfig {

	@Autowired
	Environment env;

	@Bean
	public DataSource getDataSource() {

		DriverManagerDataSource datasource = new DriverManagerDataSource();

		datasource.setUrl(env.getProperty("url"));
		datasource.setUsername(env.getProperty("uname"));
		datasource.setPassword(env.getProperty("password"));

		return datasource;

	}

}