package CollectionAssignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Auniqueelefromarraylist1 {

	public static void main(String[] args) {
 System.out.println("print elements using list");
		
		List<Integer> list= new ArrayList<Integer>();
		list.add(100);
		list.add(570);
		list.add(541);
		list.add(500);
		list.add(152);
		list.add(1);
		//print elements using list
		
		Iterator<Integer> itr =list.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}

	System.out.println("\n\nAdding list in queue and printing elements");
	  Queue queue=new PriorityQueue(list);
	  
	  Iterator itr1= queue.iterator();
	  while(itr1.hasNext()) {
		  System.out.print(itr1.next()+" ");
	  }
	  
	}

}
