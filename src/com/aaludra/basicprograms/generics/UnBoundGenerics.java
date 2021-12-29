package com.aaludra.basicprograms.generics;

import java.util.List;

public class UnBoundGenerics {
	// Unbound we didn't specify bounded region so we can access any type of data
	public static void show(List<?> obj) {
		for (Object o : obj) {
			System.out.println(o);
		}
	}

}
