package collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue1 {

	public static void main(String[] args) {

		Queue<Integer> q = new PriorityQueue<Integer>();
		q.add(1);
		q.add(3);
		q.add(5);
		q.add(1); // it allows duplicate values
		q.add(2);

		System.out.println(q);
		System.out.println(q.element());
		System.out.println(q.peek());
		System.out.println(q.size());
		 
		/*Iterator<Integer> itr = q.iterator();
		System.out.println(itr.hasNext());
		System.out.println(itr.next());
		System.out.println(itr.next());
		System.out.println(itr.next());
		System.out.println(itr.next());
		System.out.println(itr.next());
		*/
		System.out.println("using for each loop");
		for(Object o:q) {
			System.out.println(o);
		}
		
		 
		System.out.println("another queue");
		Queue<Integer> q1 = new PriorityQueue<Integer>();

		System.out.println(q1.size());

//		System.out.println(q1.element());
		System.out.println(q1.peek());

	}
}
