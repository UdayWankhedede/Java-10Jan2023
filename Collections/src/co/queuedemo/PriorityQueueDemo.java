package co.queuedemo;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

class MyComparator implements Comparator<Integer>
{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o1-o2;
	}
	
}

public class PriorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
//		
//		pq.add("udya");
//		pq.add("Aditi");
//		pq.add("Piyush");
//		pq.add(null); //it doesnot allow null gives null pointer exception
//		
		pq.offer(23);
		
//		Iterator <String> itr = pq.iterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
	}
}
