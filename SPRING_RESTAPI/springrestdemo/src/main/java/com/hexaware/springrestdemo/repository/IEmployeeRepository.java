package com.hexaware.springrestdemo.repository;

import java.util.List;

import com.hexaware.springrestdemo.entity.Employee;

public interface IEmployeeRepository {
	
	
	public Employee addEmployee(Employee employee);

	public Employee updateEmployee(Employee employee);

	public Employee getEmployeeById(int eid);

	public String deleteEmployeeById(int eid);
	
	public  List<Employee>  getAllEmployees();
	

}
