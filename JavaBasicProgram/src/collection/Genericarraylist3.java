package collection;

import java.util.ArrayList;
import java.util.Collections;

public class Genericarraylist3 {

	public static void main(String[] args) {
 
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Indore");
		list.add("Indore1");
		list.add("Indore2");
		list.add("Indore3");
		list.add("Indore42");		
		
		System.out.println(list);
		
		
		Collections.reverse(list);
		System.out.println(list);
	}

}
