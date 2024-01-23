package com.hexaware.springcore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.hexaware.springcore.*")
public class AppConfig {
	
		@Bean
		public  String   getString() {
			
			
			return new String("javeed");
			
		}

}
