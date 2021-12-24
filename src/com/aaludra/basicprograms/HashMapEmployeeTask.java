package com.aaludra.basicprograms;

import java.util.HashMap;
import java.util.Map;

public class HashMapEmployeeTask {


//	public static void main(String[] args) {
//		Map<String, String> map = new HashMap<String, String>();
//		map.put("101", "Suganya");
//		map.put("103", "Moshika");
//		map.put("102", "Hari");
//		map.put("105", "Saranya");
//		map.put("104", "Babu");
//
//		getEmployee(map, "101");
//
//	}

	public static <K, V> K getKey(Map<K, V> map, V value) {
		for (K key : map.keySet()) {
			if (value.equals(map.get(key))) {
				return key;
			}
		}
		return null;
	}

	public static void main(String[] args) {
		Map<String, String> hashMap = new HashMap();
		hashMap.put("A", "1");
		hashMap.put("B", "2");
		hashMap.put("C", "3");

		System.out.println(getKey(hashMap, 2)); // prints `B`
	}
		}
