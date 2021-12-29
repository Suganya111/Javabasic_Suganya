package com.aaludra.basicprograms.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionsArrayList {

	public static void main(String[] args) {
		List<String> name = new ArrayList<String>();
		name.add("Suganya");
		name.add("Moshika");
		name.add("Jamuna");
		name.add("Sumathi");
		name.add("Chithra");

		System.out.println(name);

		for (String names : name) {
			System.out.println(names);
		}
		Iterator<String> it = name.iterator();
		while (it.hasNext()) {

			if (it.next().equals("Chithra")) {
				it.remove();
				System.out.println("Chithra removed");
			}
			for (String names : name) {
				System.out.println(names);
			}
		}

	}

}
