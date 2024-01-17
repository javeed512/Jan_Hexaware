package map;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {


		Map<Integer,String> map = new LinkedHashMap<Integer,String>();
		
			  map.put(99, "ravi");
			  map.put(102, "smith");
			  map.put(101, "tom");
			  map.put(102, "sai");
			  map.put(13, "ravi");
			  map.put(554, "john");
			  
			  System.out.println(map);
			  
			  
			Set<Integer> set =  map.keySet();
			
				Iterator<Integer> it =	set.iterator();
				
				while (it.hasNext()) {
					Integer k =  it.next();
					
					System.out.println(k +" "+map.get(k));
					
				}
				
			Collection<String> list = map.values();
				
				for (String name : list) {
					
					System.out.println(name);
					
				}
				
				
				
				
				
				
				
				
				
	}

}
