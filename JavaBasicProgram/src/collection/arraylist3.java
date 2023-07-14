package collection;
 
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class arraylist3 {

	public static void main(String[] args) {
 
		List list = new ArrayList();
		
		list.add("Indore");
		list.add("Delhi");
		list.add("Pune");
		list.add("Mumbai");
		System.out.println( "Elements in list are :" +list);
		System.out.println("No. of elements in list are :" +list.size());
		System.out.println("using for loop");
		 for(int i =0;i<list.size();i++) {
			 System.out.println(list.get(i));
		 }
		 System.out.println("using for each loop");
		 for(Object o:list) {
			 System.out.println(o);
		 }
		 list.set(0, "Hyderabad");
		 System.out.println(list);
		 System.out.println(list.size());
  
Collections.sort(list);	//it will sort in ascending order
System.out.println(list);
System.out.println(list.size());
System.out.println("using for loop");
for(int i =0;i<list.size();i++) {
	 System.out.println(list.get(i));
}
	
	}

}
