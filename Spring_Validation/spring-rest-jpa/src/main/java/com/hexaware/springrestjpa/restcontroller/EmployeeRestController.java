package com.hexaware.springrestjpa.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.springrestjpa.entities.Employee;
import com.hexaware.springrestjpa.service.EmployeeServiceImp;
import com.hexaware.springrestjpa.service.IEmployeeService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/employees")
public class EmployeeRestController {

	@Autowired
	IEmployeeService service;

	@PostMapping("/add")
	public Employee insertEmployee(@RequestBody Employee emp) {
		
		boolean  isValid =	EmployeeServiceImp.validateEmployeeData(emp);
		
		Employee employee = null;
		
			if(isValid) {
				
				employee = service.addEmployee(emp);
			}

		return employee;

	}
	
	@PutMapping("/update")
	public Employee  updateEmployee(@RequestBody @Valid   Employee emp) {

		return service.updateEmployee(emp);

	}

	
	@GetMapping("/get/{eid}") 
	public Employee   getEmployeeById(@PathVariable long eid) {
		
		return  service.getEmployeeById(eid);
		
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
