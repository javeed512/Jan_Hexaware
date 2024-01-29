package com.hexaware.springbootweb.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hexaware.springbootweb.entity.Employee;

@Repository
public class EmployeeDaoImp implements IEmployeeDao {

	JdbcTemplate jdbcTemplate;

	public EmployeeDaoImp() {

	}

	@Autowired
	public EmployeeDaoImp(DataSource datasource) {

		jdbcTemplate = new JdbcTemplate(datasource);

		System.out.println(jdbcTemplate);

	}

	@Override
	public String addEmployee(Employee emp) {

		String insert = "insert into employee_table values(?,?,?)";

		int count = jdbcTemplate.update(insert, emp.getEid(), emp.getEname(), emp.getSalary());

		return count + " record inserted";
	}

	@Override
	public List<Employee> getAll() {

		String select = "select eid,ename,salary from employee_table";

		List<Employee> list = jdbcTemplate.query(select, new EmployeeMapper());

		return list;
	}

}
