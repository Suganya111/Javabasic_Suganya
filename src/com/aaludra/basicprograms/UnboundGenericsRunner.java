package com.aaludra.basicprograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class UnboundGenericsRunner {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 5, 7);

		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(3, "Suganya");
		map.put(4, "Moshika");
		map.put(5, "Jamunaa");

		Set<String> set = new TreeSet<String>();
		set.add("aaa");
		set.add("bbb");
		set.add("ccc");
		set.add("ddd");

		BoundGenerics bg = new BoundGenerics();
		bg.show(list);
		bg.show(set);
		bg.show(map);

	}

}
