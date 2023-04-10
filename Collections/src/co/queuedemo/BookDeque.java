package co.queuedemo;

import java.util.ArrayDeque;

public class BookDeque 
{
	public static void main(String[] args) {
		Book bobj = new Book();
		ArrayDeque<Book> adq = new ArrayDeque<>();
		
		Book b1 = new Book(101,"marvel",1000);
		Book b2 = new Book(102,"DC",500);
		Book b3 = new Book(103,"13Reason",300);
		Book b4 = new Book(104,"Dark",200);
		
//		adq.offer(new Book(101,"marvel",1000));
//		adq.offer(new Book(102,"DC",500));
//		adq.offer(new Book(103,"13Reason",300));
//		adq.offer(new Book(104,"Dark",200));
		
//		System.out.println(adq);
//		System.out.println("=====================================");
//		adq.offer(new Book(104,"Dark",500));
//		System.out.println(adq);
		
		for(Book b : adq)
		{
			System.out.println(b);
		}
	}

	
}
