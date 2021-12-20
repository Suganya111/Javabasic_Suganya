package com.aaludra.basicprograms;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapExample {

	public static void main(String[] args) {

		LinkedHashMap<String, Integer> lkm = new LinkedHashMap();
		lkm.put("tablets", 50);
		lkm.put("Syrup", 70);

		lkm.put("Injection", 150);
		System.out.println(lkm);
		Set s = lkm.entrySet();
		Iterator itr = s.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		lkm.putIfAbsent("Antibiotic", 50);
		System.out.println(lkm);
		System.out.println(lkm.containsKey("Pencilin"));
		System.out.println(lkm.containsValue(150));
		LinkedHashMap<String, Integer> lkm1 = new LinkedHashMap();
		lkm1.putAll(lkm);
		lkm1.put("water", 25);
		lkm1.put("Sanitizer", 50);
		System.out.println(lkm1);

	}

}
