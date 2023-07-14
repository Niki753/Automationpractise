package collection;

import java.util.ArrayList;
import java.util.List;

public class arraylist1 {

	public static void main(String[] args) {

		List list = new ArrayList(); // array list ka object and
		// list interface ka reference - upcasting
		// this is recommended
		// OR

		// ArrayList al = new ArrayList();//arraylist ka object and usi ka reference
		list.add("Apple");
		list.add("Mango");
		list.add("Banana");
		System.out.println("The elements in list are :" + list);
		System.out.println("The number of elements in list collection are: " + list.size());
		list.add(1, "Grapes");
		System.out.println("updated list :" + list);
		System.out.println("The number of elements in list collection are: " + list.size());

		Object obj = list.get(1);
		System.out.println("the element on 1st index is :" + obj);
		Object obj3 = list.get(3);
		System.out.println("the element on 3rd index is :" + obj3);
		System.out.println("to print elements of list using for loop");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("using for each loop");
		for (Object obj2 : list) {
			System.out.println(obj2);
		}
		list.set(3, "Cheeku");
		System.out.println(" after update list elements are : " + list);
		System.out.println("using for each loop again and print elements ");
		for (Object o : list) {
			System.out.println(o);
		}
		System.out.println("using for loop again to print elements");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

	}

}
