package collection;

import java.util.ArrayList;
import java.util.List;

public class arraylist2 {

	public static void main(String[] args) {

		List list = new ArrayList();
		list.add("Indore");
		list.add("Pune");
		list.add("Delhi");
		list.add("Mumbai");
		System.out.println(list);
		System.out.println(list.size());
		list.add(1, "Kashmir");

		System.out.println("list after adding kashmir");
		System.out.println(list);
		System.out.println(list.size());
		list.set(2, "Hyderabad");

		System.out.println("list after setting 2nd element");
		System.out.println(list);
		System.out.println(list.size());

		System.out.println("using for loop");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("using for each loop");
		for (Object o : list)
			System.out.println(o);
	}

}
