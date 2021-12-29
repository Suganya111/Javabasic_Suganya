package com.aaludra.basicprograms.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapEmployeeTask {

	public static <K, V> K getKey(Map<K, V> map, V value) {
		for (K key : map.keySet()) {
			if (value.equals(map.get(key))) {
				return key;
			}
		}
		return null;
	}

	public static void main(String[] args) {
		Map<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("A", "1");
		hashMap.put("B", "2");
		hashMap.put("C", "3");

		System.out.println(getKey(hashMap, "2")); // prints `B`
	}
		}
