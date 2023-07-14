package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset2 {

	public static void main(String[] args) {
 
		TreeSet<String> set = new TreeSet<String>();
		set.add("zoya");
		set.add("Amala");
		set.add("kamla");
		set.add("koko");
		set.add("kashish");
		
		System.out.println(set);
//		System.out.println(set.pollFirst());
		System.out.println(set);
	//	System.out.println(set.pollLast());
		System.out.println(set);
	
	System.out.println(set.descendingSet());
 
	Iterator itr = set.descendingIterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());}
	System.out.println("using headset subset and tailset");
	System.out.println(set.headSet("kashish")); 
	System.out.println(set.headSet("koko", true));
	System.out.println(set.headSet("koko", false));
	
	System.out.println(set.subSet("Amala", "zoya"));
	 System.out.println(set.subSet("Amala", false, "koko", true));
	
	System.out.println(set.tailSet("kashish"));
	System.out.println(set.tailSet("kamla", false));
	System.out.println(set.tailSet("kamla", true));
	
	}

}
