package com.hexaware;

public class StringModification {

	public static void main(String[] args) {


		String s1 = new String("hello");
		
		s1 =  s1.concat(" world");
		  
		  System.out.println(s1);
		s1 = s1 + " again";
		
		System.out.println(s1);
		
		
		StringBuffer sb1 = new StringBuffer("hello");
		
		sb1.append(" world");
		
				
		
		String name1 = new String("A"); // 65
		String name2 = new String("B"); // 66
		  
		
		System.out.println(name1.compareTo(name2)); // 1
		

	}

}
