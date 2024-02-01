package com.hexaware.springrestjpa.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class EmployeeExceptionHandler { // Global exp handler
	
			@ResponseStatus(value=HttpStatus.NOT_FOUND , reason = "Employee Not Found in DB")
			@ExceptionHandler({EmployeeNotFoundException.class})
			public void  handler() {
				
				
			}

}
