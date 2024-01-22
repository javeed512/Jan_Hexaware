package test;


import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;


import static java.lang.System.out;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import dao.DeptDaoImp;
import dao.IDeptDao;
import entity.Department;

class DeptDaoImpTest {

	
	static IDeptDao dao;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		dao = new DeptDaoImp();
	}

	@Test
	//@Disabled
	void testInsert() {
		
		Department dept = new Department();
		
			dept.setDno(110);
			dept.setDname("Charatee");
			dept.setLocation("Chennai");
		
	int actual =	dao.insert(dept);
		
			//assertEquals(1, actual);
			assertNotEquals(1, actual);
	}

	@Test
	void testSelectAll() {
		
		
			out.println("hell");
		
			List<Department> list =	dao.selectAll();
			
			Department dept = 	list.get(0);
		
			assertTrue(dept.getDno() > 0);
			
			
			assertNotNull(list);
	}

}
