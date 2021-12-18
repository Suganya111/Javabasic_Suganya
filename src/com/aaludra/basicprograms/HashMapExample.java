package com.aaludra.basicprograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class HashMapExample {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(51, "Sruthi");
		hm.put(52, "Sowmya");
		hm.put(53, "Suganya");
		hm.put(54, "SugaPriya");
		hm.put(55, "Sunmuga Priya");
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		System.out.println(hm.containsKey(55));
		System.out.println(hm.containsValue("Sruthi"));
		System.out.println(hm.get(53));
		System.out.println(hm);

		Set s = hm.entrySet();
		Iterator it = s.iterator();
		while (it.hasNext()) {
			// System.out.println(it.next());

			Map.Entry me = (Map.Entry) it.next();
			System.out.println(me.getKey());
			System.out.println(me.getValue());

		}
	}

}
