package com.hexaware.restapi.exception;

import org.springframework.http.HttpStatusCode;
import org.springframework.web.server.ResponseStatusException;

public class ProductNotFoundException extends ResponseStatusException {

	public ProductNotFoundException(HttpStatusCode status,String msg) {
		super(status,msg);
		
	}

}
