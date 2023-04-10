package co.queuedemo;

import java.util.ArrayDeque;

public class ArrayDequeDemo {

	public static void main(String[] args) {
		ArrayDeque<String> adq = new ArrayDeque<>();
		
		adq.offer("Tea");
		adq.offer("Coffee");
		adq.offer("Juice");
		
		System.out.println(adq);
		
		System.out.println(adq);

		System.out.println("=====================================");
		adq.pollFirst();
		System.out.println(adq);

		System.out.println("=====================================");
		System.out.println(adq.peekFirst());
	}
}
