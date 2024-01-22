package com.hexaware.springannotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.hexaware.springannotations.beans.Employee;

@Configuration
@ComponentScan(basePackages = "com.hexaware.springannotations.*")
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		ApplicationContext context = new AnnotationConfigApplicationContext(App.class);

		Employee emp = context.getBean(Employee.class);
		
		Employee emp1 =	context.getBean("emp1",Employee.class);

		emp.setEid(101);
		emp.setEname("king");

		System.out.println(emp);
		System.out.println(emp1);
		System.out.println(emp.getEid() + " " + emp.getEname());
		
		

	}
}
