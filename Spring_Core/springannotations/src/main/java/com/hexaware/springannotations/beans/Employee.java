package com.hexaware.springannotations.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("emp1")
@Scope("prototype")
//@Service
//@Repository
//@Controller
public class Employee {
	
	
		private int eid;
		private String ename;
		
		public Employee() {
			
			
		}
		
		public Employee(int eid, String ename) {
			super();
			this.eid = eid;
			this.ename = ename;
		}

		public int getEid() {
			return eid;
		}

		public void setEid(int eid) {
			this.eid = eid;
		}

		public String getEname() {
			return ename;
		}

		public void setEname(String ename) {
			this.ename = ename;
		}
	
		
		
		
	

}
