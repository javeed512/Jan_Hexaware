package extra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ExtraDemos {

	public static void main(String[] args) {


		List<Integer> list = new ArrayList<Integer>(); 
		
	 	list.add(30); // new Integer(30);
	 	list.add(10);
	 	list.add(20);
	 	list.add(40);
	 	list.add(20);
	 	
	 		
	 		Object[] arr =		list.toArray();
	 		
	 		System.out.println(arr);
	 
		
	 		
	 		Integer a1[] = {22,77,55,33};
	 		
	 		System.out.println(a1);
	 		
	 		//System.out.println(a1[0]);
	 		
	 		System.out.println("array size "+a1.length);
	 		
	 		
	 		List<Integer> list2 =		Arrays.asList(a1);
	 								
	 		
	 		
	 		int a2[] = new int[5];
	 		
	 		System.out.println(a2);
	 		
	 		System.out.println(a2[1]);
	 		
	 		
	 		
	 		
	 		
	 		
	 		
	 		
	 		
	 		
	 		
	 		
	 		
	 		
	 		
	 		
		

	}

}
