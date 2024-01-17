package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {


      Set<String>	set =	new HashSet<String>();
		
		
      	set.add("king");  // 3
      	System.out.println(set.add("smith")); //2
      	set.add("adam"); // 1
      	set.add("ford");  // 4
      	System.out.println(set.add("smith"));
      	
      	System.out.println(set);
      	
      	
      	
      	 Set<Integer>	set2 =	new LinkedHashSet<Integer>();
 		
 		
       	set2.add(34); // 1
       	set2.add(12);  //4
       	set2.add(56); // 2
       	set2.add(9);  //3
       	
       	System.out.println(set2);
      	
      	
        for (Integer i : set2) {
			
        	System.out.println(i);
		}
       	
      	
      
	}

}
