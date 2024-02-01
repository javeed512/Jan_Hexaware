package com.hexaware.springrestjpa.restcontroller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.springrestjpa.dto.EmployeeDTO;
import com.hexaware.springrestjpa.entities.Employee;
import com.hexaware.springrestjpa.exception.EmployeeNotFoundException;
import com.hexaware.springrestjpa.service.EmployeeServiceImp;
import com.hexaware.springrestjpa.service.IEmployeeService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/employees")
public class EmployeeRestController {

	@Autowired
	IEmployeeService service;
	
	Logger  logger =	LoggerFactory.getLogger(EmployeeRestController.class);
	

	@PostMapping("/add")
	public Employee insertEmployee(@RequestBody EmployeeDTO employeeDTO) {
		
		boolean  isValid =	EmployeeServiceImp.validateEmployeeData(employeeDTO);
		
		logger.info("EmployeeRestController executed...");
		
		Employee employee = null;
		
			if(isValid) {
				
				employee = service.addEmployee(employeeDTO);
				
				logger.warn("employee object is not null in RestController");
			}
			
			
			logger.debug("debugging from RestController");

		return employee;

	}
	
	@PutMapping("/update")
	public Employee  updateEmployee(@RequestBody @Valid   Employee emp) {

		return service.updateEmployee(emp);

	}

	
	@GetMapping("/get/{eid}") 
	public Employee   getEmployeeById(@PathVariable long eid) throws EmployeeNotFoundException {
		
		Employee emp =  service.getEmployeeById(eid);
			if(emp == null) {
				
				throw  new EmployeeNotFoundException();
				
			}
		
			return emp;
		
	}
	
	@GetMapping("/getall")
	public List<Employee>  getAll(){
		
		
		return service.getAllEmployees();
		
	}
	
	
	@DeleteMapping("/delete/{eid}") 
	public String  deleteById(@PathVariable long eid) {
		
		return  service.deleteEmployeeById(eid);
		
	}
	
	@GetMapping("/getbyename/{ename}")
	public List<Employee>  getByEname(@PathVariable String ename){
		
		
		return service.getByEname(ename);
		
	}
	
	@GetMapping("/getbysalarygt/{salary}")
	public List<Employee>  getBySalaryGT(@PathVariable double salary){
		
		
		return service.getBySalaryGT(salary);
		
	}
	
	
	@GetMapping("/getbysalarysorted")
	public List<Employee>  getBySalarySorted(){
		
		
		return service.getBySalarySorted();
		
	}
	
	@GetMapping("/getsalarybyrange/{min}/{max}")
	public List<Employee>  getBySalarySorted(@PathVariable double min , @PathVariable double max){
		
		
		return service.getBySalaryRange(min, max);
		
	}
	
	@DeleteMapping("/deletebyename/{ename}")
	public String  deleteByEname(@PathVariable String ename) {
		
		
	  int count =	service.deleteByEname(ename);
	  
	 return  count + " record deleted";
		
	}
	
	

}
