package com.aaludra.basicprograms.collections;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		Employee e1 = new Employee(55, "Sunmuga Priya", "Rajapalayam", "Software Trainee", 10000, 2013);
		Employee e2 = new Employee(52, "Suga Priya", "KovilPatti", "Software Engineer", 18000, 2011);
		Employee e3 = new Employee(54, "Subha", "Sethur", "Software Junior Developer", 12000, 2017);
		Employee e4 = new Employee(51, "Sowmya", "Tenkasi", "Software Senior Developer", 20000, 2014);
		Employee e5 = new Employee(53, "Sruthi", "Tirunelveli", "Software Testing", 15000, 2015);

		SortedMap<Integer, Employee> map = new TreeMap<Integer, Employee>();

		map.put(107, e1);
		map.put(104, e2);
		map.put(108, e3);
		map.put(103, e4);
		map.put(101, e5);

		for (Map.Entry<Integer, Employee> m : map.entrySet()) {
			int key = m.getKey();
			Employee e = m.getValue();
			System.out.println(key + " Details");
			System.out.println("Name  " + e.name + "City  " + e.city + " Designation  " + e.designation + "Slaray  "
					+ e.salary + "Year of Joining " + e.yoj);

		}
		SortedMap<Integer, String> m = new TreeMap<Integer, String>();
		m.put(32, "Cat");
		m.put(45, "Apple");
		m.put(21, "Zebra");
		m.put(43, "Banana");
		m.put(03, "Cake");
		System.out.println("Head Map : " + m.headMap(21));
		System.out.println("Tail Map : " + m.tailMap(21));
		System.out.println("Sub Map: " + m.subMap(21, 43));

	}

}
