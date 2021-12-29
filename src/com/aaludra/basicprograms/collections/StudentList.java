package com.aaludra.basicprograms.collections;

import java.util.ArrayList;
import java.util.Collections;

public class StudentList {

	public static void main(String[] args) {

		ArrayList<StudentWrapper> list = new ArrayList<>();
		list.add(new StudentWrapper(1, "Anitha", 89));
		list.add(new StudentWrapper(5, "Chithra", 43));
		list.add(new StudentWrapper(4, "Indhu", 78));
		list.add(new StudentWrapper(7, "Janani", 65));
		list.add(new StudentWrapper(5, "Saranya", 21));
		System.out.println("Before Sorting");
		System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		Collections.sort(list);// sorting done according to marks
		// If we need to sort according to rollno create a wrapper class for rollno
		// and make changes in the compareto method which needs to be implemented
		// because of Comparable class which is implemented by Student Wrapper class
		System.out.println("After sorting");
		for (int j = 0; j < list.size(); j++) {
			System.out.println(list.get(j));
		}
	}

}
