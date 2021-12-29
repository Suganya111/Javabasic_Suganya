package com.aaludra.basicprograms.collections;

import java.util.Comparator;

public class IdComparatorExample implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		Person p1 = (Person) o1;
		Person p2 = (Person) o2;
		if (p1.id < p2.id)
			return 1;
		else if (p1.id > p2.id)
			return -1;
		else
			return 0;
		// return 0;
	}

}
