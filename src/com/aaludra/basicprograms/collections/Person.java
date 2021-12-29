package com.aaludra.basicprograms.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person {
	int id;
	String name;
	int age;

	public Person(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}


	public static void main(String[] args) {
		List<Person> list = new ArrayList<Person>();
		list.add(new Person(5, "Suganya", 27));
		list.add(new Person(3, "Moshika", 3));
		list.add(new Person(8, "Jamuna", 21));
		list.add(new Person(1, "Sumathi", 40));
		list.add(new Person(4, "Chithra", 50));
		System.out.println("Person  data");
		for (Person l : list) {
			System.out.println(l.id + " " + l.name + " " + l.age);

		}
		Collections.sort(list, new AgeComparatorExample());
		System.out.println("Person based on age comparing");
		for (Person l : list) {
			System.out.println(l.id + " " + l.name + " " + l.age);
		}
		Collections.sort(list, new NameComparatorExample());
		System.out.println("Person based on age comparing ascending order");
		for (Person l : list) {
			System.out.println(l.id + " " + l.name + " " + l.age);
		}
		Collections.sort(list, new IdComparatorExample());
		System.out.println("Person  data based on id descending order");
		for (Person l : list) {
			System.out.println(l.id + " " + l.name + " " + l.age);
		}
	}

}
