package com.hexaware.restapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ProductExceptionHandler {
	
		
				
	
		@ExceptionHandler({Exception.class})
		public ResponseEntity<String> handleAnyExp(Exception e) {
			//System.out.println("I am  Global Exp Handler handle exp");
			
			return new ResponseEntity<String>(e.toString(),HttpStatus.BAD_REQUEST);
		}
	

}
