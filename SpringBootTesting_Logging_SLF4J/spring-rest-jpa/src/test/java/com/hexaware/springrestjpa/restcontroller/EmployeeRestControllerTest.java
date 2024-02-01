package com.hexaware.springrestjpa.restcontroller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.hexaware.springrestjpa.entities.Employee;

@SpringBootTest
class EmployeeRestControllerTest {

	@Autowired
	RestTemplate restTemplate;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	void testInsertEmployee() {
		
		Employee emp = new Employee(123, "HUSSAIN", 35000);
		
	ResponseEntity<Employee>  response =  
			restTemplate.postForEntity("http://localhost:8080/api/employees/add", emp, Employee.class);

						Employee e = response.getBody();
						
							assertEquals(123, e.getEid());
							
					
							
						
	
	}	

	@Test
	void testUpdateEmployee() {

	}

	@Test
	void testGetEmployeeById() {

		int eid = 101;

		ResponseEntity<Employee> response = restTemplate.getForEntity("http://localhost:8080/api/employees/get/" + eid,
				Employee.class);

		Employee emp = response.getBody();

		assertNotNull(emp);
		assertEquals(101, emp.getEid());

	}

	@Test
	void testGetAll() {

		ResponseEntity<List> response = 
				restTemplate.getForEntity("http://localhost:8080/api/employees/getall",List.class);

		List<Employee> list = response.getBody();
		
	

		assertTrue(list.size() > 0);
		
		
		
		List<Employee> list2 =	restTemplate.getForObject("http://localhost:8080/api/employees/getall", List.class);
		
		assertNotNull(list2);

	}

	@Test
	void testDeleteById() {

	}

}
