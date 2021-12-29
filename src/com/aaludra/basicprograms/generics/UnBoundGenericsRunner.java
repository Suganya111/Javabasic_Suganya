package com.aaludra.basicprograms.generics;

import java.util.Arrays;
import java.util.List;

public class UnBoundGenericsRunner {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 5, 7);

		List<String> strlist = Arrays.asList("aaa", "bbb", "ddd");
		List<Float> flist = Arrays.asList(3.6f, 7.9f, 2.4f, 7.8f);

		UnBoundGenerics.show(list);
		UnBoundGenerics.show(strlist);
		UnBoundGenerics.show(flist);

	}

}
