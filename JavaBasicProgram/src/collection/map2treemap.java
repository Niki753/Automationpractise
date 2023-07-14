package collection;

import java.util.SortedMap;
import java.util.TreeMap;

public class map2treemap {

	public static void main(String[] args) {
 
		TreeMap<Integer, String> m= new TreeMap<Integer, String>();
		m.put(19, "ADGDFRT");
		m.put(21, "DGDFART");
		m.put(11, "GHYJGART");
		m.put(18, "SFDART");
		m.put(0, "ARTGDF");
		
       System.out.println(m);
	
	
	SortedMap<Integer, String> m2= m.subMap(11, 21);
	System.out.println(m2);
	
	}

}
