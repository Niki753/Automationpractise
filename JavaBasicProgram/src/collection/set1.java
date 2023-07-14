package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class set1 {

	public static void main(String[] args) {

		Set<Integer> set = new HashSet<Integer>();
		set.add(5);//
		set.add(3);
		set.add(1);//
		set.add(2);
		set.add(2);
		set.add(null);
		System.out.println(set);

//		System.out.println(set.remove(5));
		System.out.println(set);
		System.out.println("using iterator");
		Iterator<Integer> itr = set.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("using for each loop");
		for (Object o : set) {
			System.out.println(o);
		}

		System.out.println("***************");
		Set<String> set1 = new HashSet<String>();
		set1.add("niki");
		set1.add("Ver");
		set1.add("BAR");
		set1.add("sharma");
		System.out.println(set1);
		System.out.println(set1.remove("sharma"));
		System.out.println(set1);
		System.out.println(set1.remove("karma"));

		Set<Integer> set2 = new HashSet<Integer>();
		set2.add(50);
		set2.add(30);
		set2.add(1);

		System.out.println("using itertaor for set2");
		Iterator itr2 = set2.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		System.out.println("using for each loop");

		System.out.println(set2);
		set.addAll(set2);
		System.out.println(set);

		set.removeAll(set2);
		System.out.println(set);
		System.out.println(set2.isEmpty());

	}

}

/*
 * Set<String> set = new HashSet<String>(); set.add("Apple"); set.add("Apple");
 * set.add("Apple12"); set.add("Apple34"); set.add(null);
 * System.out.println(set);
 * 
 * 
 */
