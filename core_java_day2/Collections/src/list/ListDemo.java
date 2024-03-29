package list;

import java.util.Collections;
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

		Iterator it = list.iterator();

		while (it.hasNext()) {

			System.out.println(it.next());

		}

		System.out.println("For Each Loop");

		for (Number n : list) {

			System.out.println(n);
		}

		List<Integer> list2 = new LinkedList<Integer>();

		list2.add(30); // new Integer(30);
		list2.add(10);
		list2.add(20);
		list2.add(40);
		list2.add(50);

		Collections.sort(list2);

		System.out.println(list2);
		
		
			int  index =		Collections.binarySearch(list2, 20);
				
			System.out.println(index);
			

	}

}
