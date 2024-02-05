package com.hexaware.security3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.security3.entity.UserInfo;
import com.hexaware.security3.service.UserService;

@RestController
@RequestMapping("/registration")
public class UserRestController {

	

		@Autowired
		UserService service;
	
	 @PostMapping("/new")
	    public String addNewUser(@RequestBody UserInfo userInfo){
	        return service.addUser(userInfo);
	    }

}
