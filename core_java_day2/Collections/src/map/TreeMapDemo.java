package map;

import java.util.Map;
import java.util.TreeMap;

import pojo.Employee;
import set.MyComparator;

public class TreeMapDemo {

	public static void main(String[] args) {

		Map<Integer, String> map = new TreeMap<Integer, String>();

		map.put(99, "ravi");
		map.put(102, "smith");
		map.put(101, "tom");
		map.put(104, "sai");

		System.out.println(map);

		Map<Employee,String> map2 = new TreeMap<Employee,String>(new MyComparator());

		map2.put(new Employee(103, "ravi", 8000) , "Hyderabad");
		map2.put(new Employee(102, "tom", 7000)  ,"Pune");
		map2.put(new Employee(104, "king", 8000) , "Mumbai");
		map2.put(new Employee(101, "smith", 4000) , "Chennai");

		System.out.println(map2);
		
	}

}
