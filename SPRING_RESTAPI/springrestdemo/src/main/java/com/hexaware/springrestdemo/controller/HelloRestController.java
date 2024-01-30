package com.hexaware.springrestdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloRestController {
	
	
	@RequestMapping(value="/hello" , method = RequestMethod.GET)
	public String hello() {
		
		return "Hello Friends from RestAPI";
		
	}

}
