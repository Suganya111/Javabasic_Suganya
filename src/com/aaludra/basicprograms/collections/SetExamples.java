package com.aaludra.basicprograms.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExamples {

	public static void main(String[] args) {
		Set<String> nameHash = new HashSet<>();
		nameHash.add("Cat");
		nameHash.add("Zebra");
		nameHash.add("Donkey");
		nameHash.add("Apple");
		nameHash.add("Zebra");
		nameHash.add("Grapes");
		System.out.println(nameHash);


		Set<String> nameLinked = new LinkedHashSet<>();
		nameLinked.add("Cat");
		nameLinked.add("Zebra");
		nameLinked.add("Donkey");
		nameLinked.add("Apple");
		nameLinked.add("Zebra");
		nameLinked.add("Grapes");
		System.out.println(nameLinked);

		Set<String> nameTree = new TreeSet<>();
		nameTree.add("Cat");
		nameTree.add("Zebra");
		nameTree.add("Donkey");
		nameTree.add("Apple");
		nameTree.add("Zebra");
		nameTree.add("Grapes");
		System.out.println(nameTree);
	}


}
