package com.aaludra.basicprograms.generics;


public class GenericsExampleMethod {
//This print array method can be applicatle for all arraytype because  we have specified Element in the method
	public static <E> void printArray(E[] elements) {
		for (E element : elements) {
			System.out.println(element);
		}

	}

	public static void main(String[] args) {
		Integer[] intarray = { 1, 2, 3, 4, 5, 6 };
		Character[] chararray = { 'a', 'b', 'c', 'd', 'e' };
		String[] strarray = { "AAA", "BBB", "CCC" };
		System.out.println("Integer array");
		printArray(intarray);
		System.out.println("Character array");
		printArray(chararray);
		System.out.println("String array");
		printArray(strarray);

	}

}
