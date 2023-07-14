package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

 
public class arraylist4 {

	public static void main(String[] args) {

		List list = new ArrayList();
		list.add("E");
		list.add("F");
		list.add("A");
		list.add("I");
		list.add("Z");
	
	System.out.println(list);
	System.out.println(list.size());
	System.out.println("using for loop");
	for(int i=0;i<list.size();i++) {
		System.out.print(list.get(i)+ " ");
	}
	Collections.sort(list);
	System.out.println(list);
	
	System.out.println("using for each loop");
	for(Object o:list) {
		System.out.print(o + " ");
	}
	System.out.println("\nusing iterator");
	 Iterator itr= list.iterator();
	 
	 System.out.println(itr.hasNext());
	 System.out.println(itr.next());
	 System.out.println(itr.next());
	 System.out.println(itr.next());
	 System.out.println(itr.next());
	 System.out.println(itr.next());
	 System.out.println(itr.hasNext());
	 
	Iterator itr2= list.iterator();
	System.out.println(itr2.hasNext());
	System.out.println(itr2.next());
	System.out.println(itr2.next());
	System.out.println(itr2.next());
	System.out.println(itr2.next());
	System.out.println(itr2.next());
	System.out.println(itr2.hasNext());
	
	}
	
	
	
}
