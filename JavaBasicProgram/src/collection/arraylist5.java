package collection;

import java.util.ArrayList;
import java.util.List;

public class arraylist5 {

	public static void main(String[] args) {
 
		List list1 = new ArrayList();
		System.out.println(list1);
		System.out.println(list1.size());
	    System.out.println(list1.isEmpty());
		System.out.println("*******");
	    List list = new ArrayList();
		
        list.add("Indore");
		list.add("Delhi");
		list.add("Pune");
		list.add("Mumbai");
		System.out.println(list);
		System.out.println(list.size());
	System.out.println(list.isEmpty());
	 list.add(1, "Mhow");
	 System.out.println(list);
	System.out.println(list.size());
	
	List list3 = new ArrayList();
	list3.add("Nikita");
	list3.add("Verma");
	System.out.println("adding elements of list 3 with the elements in list after last last index of list");
	list.addAll(list3);
	System.out.println(list);
	System.out.println(list.size());
	
	List list4 = new ArrayList();
	list4.add("Yogesh");
	list4.add("Barania");
	System.out.println("adding elements of list 4 with the elements in list but after index 2 ");
	
	list.addAll(2, list4);
	System.out.println(list);
	
	
	}
}
