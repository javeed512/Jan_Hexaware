package set;

import java.util.Comparator;

import pojo.Employee;

public class MyComparator  implements Comparator<Employee>{

	@Override
	public int compare(Employee e1,Employee e2) {
		
		String s1 = e1.toString();
		String s2 = e2.toString();
		
		return s1.compareTo(s2);
	}

}
