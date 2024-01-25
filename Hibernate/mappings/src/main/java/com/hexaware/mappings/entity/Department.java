package com.hexaware.mappings.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Department {
	
	@Id
	private int departmentId;
	private String departmentName;
	
	
	
	@OneToMany(cascade = CascadeType.ALL , mappedBy = "department")
	//@JoinColumn(name="dno")   // dno is FK in Employee child table
	private  Set<Employee>  employeeSet = new HashSet<Employee>();  
	                     // collections types should be initialize always to avoid NullPointExp

	
	public Department() {
		
		
	}
	
	
	public Department(int departmentId, String departmentName, Set<Employee> employeeSet) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.employeeSet = employeeSet;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public Set<Employee> getEmployeeSet() {
		return employeeSet;
	}

	public void setEmployeeSet(Set<Employee> employeeSet) {
		this.employeeSet = employeeSet;
	}

	
	public void   addEmployee(Employee emp) {
		
		emp.setDepartment(this);
				
				
			Set<Employee>  set = getEmployeeSet();
			
				set.add(emp);
				
				
	}
	
	
	
	
	
	
}
