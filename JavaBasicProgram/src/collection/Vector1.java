package collection;

import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
       
		Vector<String> vec= new Vector<String>();
		vec.add("ABC");
		vec.add("DEF");
		vec.add("GHI");
		vec.add("ABC");
		vec.add("DEF");
		vec.add("GHI");
		
		System.out.println(vec);
		
		vec.addElement("jkl");

		vec.addElement("jkl");

		vec.addElement("jkl");
		vec.addElement("jkl");

		System.out.println(vec);
		vec.add("mno");
		System.out.println(vec);
		
	System.out.println(vec.firstElement());
		System.out.println(vec.lastElement());
		System.out.println(vec.get(2)); 
		System.out.println(vec.size());
		System.out.println(vec.capacity());
		Vector<Integer> vec1= new Vector<Integer>();
		 
		System.out.println(vec1.size());
		vec1.setSize(2);

		System.out.println(vec1.size());
		System.out.println(vec1);
		vec1.add(1);
		vec1.add(5);
		System.out.println(vec1.size());
		System.out.println(vec1);
		
		
	}

}
