package com.aaludra.basicprograms;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<String>();
		names.add("Apple");
		names.add("Ball");
		names.add("Cat");
		names.add("Dog");
		names.add("Ear");
		// Iterator is used to iterate values in collection framework
		// It has three methods hasNext-boolean return type, true if it exist or false
		// it it doesn't exist
		// next() which returns the element values in the list
		// remove() is used to remove the element in the list
		System.out.println("Before iteration " + names);
		Iterator<String> i = names.iterator();

		while (i.hasNext()) {
			if (i.next().equals("Ball")) {
				i.remove();

				if (i.next().equals("Cat")) {
					i.remove();
				}
			}
		}
		System.out.println("After iteration " + names);

	}
}