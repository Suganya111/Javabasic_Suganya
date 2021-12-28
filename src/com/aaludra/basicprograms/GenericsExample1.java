package com.aaludra.basicprograms;

import java.util.LinkedList;
import java.util.List;

//Generics is used in collections for specifying data type
public class GenericsExample1 {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(4);
		list.add(5);
		list.add(3);
		list.add(7);
		list.add(6);
		list.add(8);
		// list.add("Suganya"); we can't specify string under integer datatype compile
		// type error
		System.out.println(list.get(5) + list.get(0) + list.get(2));


	}



}
