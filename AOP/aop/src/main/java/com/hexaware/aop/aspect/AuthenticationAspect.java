package com.hexaware.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AuthenticationAspect {
	
	
	@Pointcut(" execution(* com.hexaware.aop.service.BankService.login())")
	public void authentication() {  // point cut -1
		
		
	}
	
	
	@Pointcut(" execution(* com.hexaware.aop.service.BankService.*())")
	public void authorization() { // point cut-2
		
		
		
	}
	
	@Before("authentication()  && authorization() ")
	public void authenticationAuthorization() {  // join point
		
		System.out.println("Login verified user login success and authorization is verified");
		
	}
	
	

}
