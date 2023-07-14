package collection;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue2 {

	public static void main(String[] args) {
 
		Queue<Integer> q = new PriorityQueue<Integer>();

		q.add(8);
		q.add(9);
		q.add(1);
		q.add(7);
		q.add(6);

		Iterator itr = q.iterator();
		
		System.out.println("iterating using iterator method");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("using for each loop");
		for(Object o:q) {
			System.out.println(o);
		}
	}

}
