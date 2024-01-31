package com.hexaware.springrestjpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.ScrollPosition.Direction;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;

import com.hexaware.springrestjpa.entities.Employee;
import com.hexaware.springrestjpa.repository.EmployeeRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class EmployeeServiceImp implements IEmployeeService {

	@Autowired
	EmployeeRepository repo;

	@Override
	public Employee addEmployee(Employee employee) {

		return repo.save(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {

		return repo.save(employee);
	}

	@Override
	public Employee getEmployeeById(long eid) {

		/*
		 * Optional<Employee> optional = repo.findById(eid); Employee emp = null;
		 * 
		 * if (optional.isPresent()) {
		 * 
		 * emp = optional.get(); }
		 */
		return repo.findById(eid).orElse(null);
	}

	@Override
	public String deleteEmployeeById(long eid) {

		repo.deleteById(eid);

		return "Record Deleted";
	}

	@Override
	public List<Employee> getAllEmployees() {

		return repo.findAll();

	}

	@Override
	public List<Employee> getByEname(String ename) {
		
		return repo.findByEname(ename);
	}

	@Override
	public List<Employee> getBySalaryGT(double salary) {
		
	
		
		
		return repo.findBySalaryGreaterThan(salary);
	}

	@Override
	public List<Employee> getBySalarySorted() {
	
		return repo.findAll(Sort.by(Order.desc("salary")));
		
				
		
		//return	repo.findAll(Sort.by("salary"));
		
	}

	@Override
	public List<Employee> getBySalaryRange(double min, double max) {
		
		return repo.getBySalRange(min, max);
	}

	@Override

	public int deleteByEname(String ename) {
	
		return repo.deleteByEname(ename);
	}

	
	
	// input validation
	
	
	public static boolean  validateEmployeeData(Employee emp) {
		
		String ename = emp.getEname();
		
			boolean flag = false;
		
			if(emp.getEid() > 99  && emp.getSalary() > 1000 && ename.equals(ename.toUpperCase())) {
				
				flag = true;
					
			}
		
			return flag;
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
