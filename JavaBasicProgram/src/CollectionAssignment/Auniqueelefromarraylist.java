package CollectionAssignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

//using arraylist and then set to print unique elements

public class Auniqueelefromarraylist {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(4);
		list.add(8);
		list.add(9);
		list.add(2);
		list.add(4);
		list.add(8);
		list.add(9);
		list.add(91);

		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		// using hashset to print only unique elements
		System.out.println("\nusing hashset");
		HashSet<Integer> set = new HashSet<Integer>(list);

		Iterator<Integer> itr1 = set.iterator();

		while (itr1.hasNext()) {
			System.out.print(itr1.next() + " ");
		}

	}

}
