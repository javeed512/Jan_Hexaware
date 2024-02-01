package com.hexaware.springrestjpa.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.hexaware.springrestjpa.entities.Employee;

@SpringBootTest

class EmployeeServiceImpTest {

	Logger logger = LoggerFactory.getLogger(EmployeeServiceImpTest.class);

	@Autowired
	IEmployeeService service;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	@DisplayName("InsertEmployee")
	void testAddEmployee() {

		Employee emp = new Employee(124, "Shashank", 9000);

		Employee e1 = service.addEmployee(emp);
		
		logger.info("Employee Added Successfully ");

		assertNotNull(e1);
		assertEquals(124, e1.getEid());

		assertTrue(e1.getEid() > 0);

	}

	@Test
	void testUpdateEmployee() {

	}

	@Test
	void testGetEmployeeById() {

		Employee emp = service.getEmployeeById(101);

		assertEquals("king khan", emp.getEname());

		assertNotEquals("smith", emp.getEname());

	}

	@Test
	void testGetAllEmployees() {

		List list = service.getAllEmployees();

		boolean flag = list.isEmpty();

		assertFalse(flag);

	}

}
