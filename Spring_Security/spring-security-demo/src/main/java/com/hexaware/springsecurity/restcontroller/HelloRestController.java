package com.hexaware.springsecurity.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloRestController {
	
	
	@GetMapping("/hello")
	public String  sayHello() {
		
		
		return "Hello Friends !";
	}
	

}
