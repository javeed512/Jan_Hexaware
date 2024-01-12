package basics;

import java.lang.Object;

public class Student extends Object{
	
 static	int sid;              // 0
 static	String sname;        // null

	
	public Student() {
		
		super();  // Object();
	}
	
	
	public static void  hello()
	{
		System.out.println("Hello");
		
	}	
	public int getSid() {
		
		hello();
	
		
		return sid;
	}
	
	
	
	
	public static void main(String[]  x) {

		int amount =0;
		
	   Student s1 =   new  Student(); //hashcode
		
	  // System.out.println(amount);
	   
	   s1.sid = 99;
	   s1.sname = "king";
	   
	   System.out.println(s1.sid);
	   System.out.println(s1.sname);
	   
	   System.out.println(s1);
	   
	   s1.getSid();
	   
	   hello();
	   
	   
	   Student s2 = new Student();
	   System.out.println(s2.sid);
	   System.out.println(s2.sname);
	   
	   
	}
	
	
	static{
		
		
	}
	
	
	
	

}
