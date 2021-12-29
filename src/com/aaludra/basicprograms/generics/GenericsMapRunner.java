package com.aaludra.basicprograms.generics;


public class GenericsMapRunner {

	public static void main(String[] args) {

		MapsGenericsInterface<Integer, String> map = new MapGenericsClass<Integer, String>();
		map.add(1, "aaa");
		map.add(2, "bbb");
		map.add(3, "ddd");
		System.out.println(map.getValue(2));

		MapsGenericsInterface<String, String> map1 = new MapGenericsClass<String, String>();
		map1.add("aaa", "bbb");
		map1.add("ccc", "ddd");
		System.out.println(map1.getKey("bbb"));


	}

}
