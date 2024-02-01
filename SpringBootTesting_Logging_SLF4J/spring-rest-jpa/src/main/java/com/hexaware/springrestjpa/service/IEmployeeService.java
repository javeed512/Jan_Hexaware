package com.hexaware.springrestjpa.service;

import java.util.List;

import com.hexaware.springrestjpa.dto.EmployeeDTO;
import com.hexaware.springrestjpa.entities.Employee;

public interface IEmployeeService {
	
	
	public Employee addEmployee(EmployeeDTO employeeDTO);

	public Employee updateEmployee(Employee employee);

	public Employee getEmployeeById(long eid);

	public String deleteEmployeeById(long eid);
	
	public  List<Employee>  getAllEmployees();
	
	
	public  List<Employee>  getByEname(String ename);
	
	public  List<Employee>  getBySalaryGT(double salary);
	
	
	public  List<Employee>  getBySalarySorted();
	
	public  List<Employee>  getBySalaryRange(double min , double max);
	
	public int  deleteByEname(String ename);
	
	
	
	
	
	
	

}
