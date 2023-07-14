package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset1 {

	public static void main(String[] args) {
 
		TreeSet<String> set= new TreeSet<String>();
		set.add("Apple");
		set.add("Mango");
		set.add("Banana");
		 
		System.out.println(set);
		 
		System.out.println("using iterator to print");
		Iterator itr= set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("using descending iterator to print in reverse order");
		Iterator itr2 =set.descendingIterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		
		
		TreeSet<Integer> set1 = new TreeSet<Integer>();
		set1.add(2);
		set1.add(5);
		set1.add(6);
		set1.add(1);
		
		System.out.println(set1);
		
		System.out.println("using iterator");
		Iterator itr1=set1.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
	}

}
