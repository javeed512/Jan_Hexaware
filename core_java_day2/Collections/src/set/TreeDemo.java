package set;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

import pojo.Employee;

public class TreeDemo {

	public static void main(String[] args) {


		Set<String> set = new TreeSet<String>();
		
		
		set.add("B");
		set.add("D");
		set.add("C");
		set.add("A");
		
		System.out.println(set);
		
		
		
		
		 Set<Integer>	set2 =	new TreeSet<Integer>();
	 		
	 		
	       	set2.add(34); 
	       	set2.add(12);  
	       	set2.add(56); 
	       	set2.add(9);  
	       	
	       	System.out.println("sorted " +set2);
	       	
	      	
	     
		
		
	    	
	 Set<Employee>	set3 =	new TreeSet<Employee>(new MyComparator());
		
		
		set3.add(new Employee(103, "ravi", 8000));
		set3.add(new Employee(102, "tom", 7000));
		set3.add(new Employee(104, "king", 8000));
		set3.add(new Employee(101, "smith", 4000));
		
		System.out.println(set3);
		
		

	}

}
