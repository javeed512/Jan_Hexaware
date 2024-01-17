package list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {


		 List<Number> list = new LinkedList<Number>(); // new ArrayList<Number>();
		
		 	list.add(30); // new Integer(30);
		 	list.add(10);
		 	list.add(20);
		 	list.add(40);
		 	list.add(20);
		 	list.add(null);
		 	list.add(4.55);
		 	list.add(9988776655L);
		 	list.add(3.99f);
		 
		 	System.out.println(list);
		 	
		 	
		 	Iterator it =	list.iterator();
		 	
		 	
		 	
		 	while(it.hasNext()) {
		 		
		 		System.out.println(it.next());
		 		
		 	}
		 	
		 	
		 	System.out.println("For Each Loop");
		 	
		 	
		 	for(Number n: list) {
		 		
		 		System.out.println(n);
		 	}
		 	
		 	
		 	
		 	

	}

}
