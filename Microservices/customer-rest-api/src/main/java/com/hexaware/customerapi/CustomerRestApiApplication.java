package com.hexaware.customerapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class CustomerRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerRestApiApplication.class, args);
	}
	
	@Bean
	public RestTemplate  getRestTemplate() {
		
		return new RestTemplate();
		
	}

}
