package collection;

import java.util.HashMap;
import java.util.Map;

public class Map1 {

     public static void main(String[] args) {
	
	Map m =new HashMap();
	m.put("key0", "der");
	m.put("key19", "der");
	m.put("key100", "der");

	m.put("key14", "abc");
	m.put("key20", "der");
	m.put("key1", "der");
	System.out.println(m); 
	System.out.println(m.size());
	m.put("key1", "abc1");
	System.out.println("m :" +m);
System.out.println("m size: "+ m.size() );	

System.out.println("to know the particular key value");
System.out.println(" value of key14: "+m.get("key14"));
System.out.println(m.get("key1"));
 
System.out.println("to print only keys");
System.out.println(m.keySet());

System.out.println("to print only values");
System.out.println(m.values());



	System.out.println("\nmaking another map m2");
	Map m2 =new HashMap();
	m2.put("key89", "123");
	System.out.println("m2 :"+m2);
	System.out.println("m2 size :" +m2.size());
	
	m.putAll(m2);
	System.out.println("m elements after putall " +m);
	System.out.println("m size after putall :" + m.size()); 
	
	}
}
