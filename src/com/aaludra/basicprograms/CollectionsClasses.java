package com.aaludra.basicprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsClasses {

	public static void main(String[] args) {
		List<Integer> num = new ArrayList<Integer>();
		num.add(3);
		num.add(6);
		num.add(90);
		num.add(45);
		System.out.println(num);
		Collections.addAll(num, 75, 53);
		System.out.println(num);
		System.out.println(Collections.max(num));
		System.out.println(Collections.min(num));
		Collections.sort(num);
		System.out.println(num);
		Collections.sort(num, Collections.reverseOrder());
		System.out.println(num);


	}

}
