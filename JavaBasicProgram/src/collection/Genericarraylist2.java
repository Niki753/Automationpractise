package collection;

import java.util.ArrayList;

public class Genericarraylist2 {

	public static void main(String[] args) {
 
		ArrayList<String> list = new ArrayList<String>();
 
	list.add("Mango");
	list.add("Banana");
	list.add("Apple");

System.out.println(list);
	

	ArrayList<String> list1 = new ArrayList<String>();

list1.add("Mango");
list1.add("Grapes");
list1.add("cheeku");

System.out.println(list1);
	
//list.addAll(list1);
//System.out.println(list);
	
//list.removeAll(list1);
//System.out.println(list);

list.retainAll(list1);
System.out.println(list);


	}

}
