package com.aaludra.basicprograms.collections;

import java.util.HashMap;
import java.util.Map;

public class BookHashMapRun {

	public static void main(String[] args) {

		HashMap<Integer, Book> map = new HashMap<Integer, Book>();

		Book b1 = new Book(32, "Times Of India", "Madhan", 2018);
		Book b2 = new Book(21, "Hindu", "Steve Mathew", 2012);
		Book b3 = new Book(54, "Nightingale", "Andriekshchoev", 2016);
		Book b4 = new Book(43, "New Thoughts", "Niroop", 2015);
		Book b5 = new Book(37, "Scope of life", "James", 2013);

		map.put(1, b1);
		map.put(2, b2);
		map.put(3, b3);
		map.put(4, b4);
		map.put(5, b5);
		 
		for (Map.Entry<Integer, Book> m : map.entrySet())
			
		{
			int key = m.getKey();
			Book b = m.getValue();
			System.out.println(key + "  Key Details");
			System.out.println(
					"Id = " + b.id + " Name =  " + b.bname + " Author = " + b.bauthor + " Year Of Publishing= "
							+ b.yop);
		}
	}

}
