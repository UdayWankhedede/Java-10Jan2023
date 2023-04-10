package com.custommap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class BookAuthorHashMap {
	public static void createAuthorBookMap(ArrayList<Book> blist) {
		HashMap<String, ArrayList<String>> authormap = new HashMap<>();

		Iterator<Book> itr = blist.iterator();
		ArrayList <String>booklist;
		while (itr.hasNext()) {
			Book b = itr.next();
			if (!authormap.containsKey(b.getAuthor())) 
			{
				booklist = new ArrayList<>();
				
			}
			else
			{
				booklist = authormap.get(b.getAuthor());
				
			}
			booklist.add(b.getName());
			authormap.put((String) b.getAuthor(), booklist);
		}
		for(Entry<String, ArrayList<String>> en : authormap.entrySet())
		{
			System.out.println(en.getKey());
			System.out.println("booklist");
			
			booklist = en.getValue();
			
			for(String s : booklist)
			{
				System.out.println(s+ " , ");
			}
			System.out.println();
			System.out.println("----------------------------------------------------");
		}

	}

	public static void main(String[] args) {

		ArrayList<Book> blist = new ArrayList<>();
		blist.add(new Book(101, "Harry Potter", 760f, new Author(1, "j.K Rowlling")));
		blist.add(new Book(102, "The christmas pig", 860f, new Author(1, "j.K Rowlling")));
		blist.add(new Book(103, "the clear blue sky", 560f, new Author(2, "Narayan murthy")));
		blist.add(new Book(104, "Hamlet", 1060f, new Author(3, "willian shakespear")));
		blist.add(new Book(105, "Othello", 460f, new Author(3, "willian shakespear")));
		blist.add(new Book(106, "the better india br=etter wworld", 1000f, new Author(2, "Narayan murthy")));

		createAuthorBookMap(blist);
		
	}

}
