package com.hexaware.security3.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.security3.dto.AuthRequest;
import com.hexaware.security3.entity.UserInfo;
import com.hexaware.security3.service.JwtService;
import com.hexaware.security3.service.UserService;

@RestController
@RequestMapping("/users")
public class UserRestController {

	

		@Autowired
		UserService service;
		
		@Autowired
		JwtService jwtService;
		
		@Autowired
		AuthenticationManager authenticationManager;
		
		
				Logger logger =	LoggerFactory.getLogger(UserRestController.class);
	
	 @PostMapping("/registration/new")
	    public String addNewUser(@RequestBody UserInfo userInfo){
	        return service.addUser(userInfo);
	    }
	 
	 
	 @PostMapping("/login/authenticate")
	 public String  authenticateAndGetTokent(@RequestBody  AuthRequest authRequest) {
		 
		 
		 
		Authentication authentication = 	authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authRequest.getUsername(), authRequest.getPassword()));
		 
		String token = null;
		
				if(authentication.isAuthenticated()) {
					
				  // call generate token method from jwtService class
					
			token =		jwtService.generateToken(authRequest.getUsername());
					
					logger.info("Tokent : "+token);
					
				}
				else {
					
					logger.info("invalid");
					
					 throw new UsernameNotFoundException("UserName or Password in Invalid / Invalid Request");
					
				}
		
				return token;
		 
	 }
	 
	 

}
