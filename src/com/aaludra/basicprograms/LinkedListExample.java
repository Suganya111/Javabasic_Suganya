package com.aaludra.basicprograms;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {

		List<Integer> num = new LinkedList<>();
		num.add(45);
		num.add(56);
		num.add(12);
		num.add(01);
		num.add(46);
		System.out.println(num);
		Collections.sort(num);
		System.out.println(num);
		Iterator<Integer> it = num.iterator();
		while (it.hasNext()) {
			if (it.next() == 01) {
				it.remove();
			}

		}

		System.out.println(num);

	}

}
