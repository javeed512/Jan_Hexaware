package com.hexaware.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.hexaware.aop.exception.InsufficientFundsExp;

@Component
@Aspect
public class LoggingAspect {  // aspect
	
	
	@Before(" execution(* com.hexaware.aop.service.*.*())")
	public void   beforeLogs() {  // join point
		
		
		System.out.println("Logging before any Bank Service");
		
	}
	
	@After(" execution(* com.hexaware.aop.service.BankService.fundTransfer())")
	public void   afterLogs() {  // join point
		
		
		System.out.println("Logging after any Fund Transfer Service");
		
	}
	
	@Pointcut(" execution(* com.hexaware.aop.service.BankService.checkBalance(..))")
	public void  afterReturningPointCut() {  // point cut
		
	}
	
	@AfterReturning(pointcut = "afterReturningPointCut()" , returning = "balance")
	public void   afterReturningBalance(int balance) { // join point
		
		System.out.println("Logs after returning balance amount : "+balance);
		
	}
	
	@AfterThrowing( pointcut = " afterReturningPointCut()" , throwing = "e")
	public void   afterThrowingExp(InsufficientFundsExp e) {
		
		System.out.println("Logs after throwing exp : "+e);
		
	}
	
	

}
