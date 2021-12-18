package com.aaludra.basicprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * you used all the methods in collection the code quality is also good
 * Java 7 introduced the diamond operator (<>) to reduce the verbosity of generics code. For instance, instead of having 
 * to declare a List's type in both its declaration and its constructor, you can now simplify the 
 * constructor declaration with <>, and the compiler will infer the type.
 * line 17
 */
public class CollectionsClasses {

	public static void main(String[] args) {
		List<Integer> num = new ArrayList<>(); // you need not to mention the data type int he diamond operator again
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
