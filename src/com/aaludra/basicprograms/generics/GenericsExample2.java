package com.aaludra.basicprograms.generics;

public class GenericsExample2 {

	public static void main(String[] args) {
		GenericsClassExample<String> str = new GenericsClassExample<String>();
		str.add("aaa");
		str.add("bbb");
		str.add("ccc");
		str.add("ddd");
		System.out.println(str.get());
		GenericsClassExample<Integer> in = new GenericsClassExample<Integer>();
		in.add(2);
		in.add(3);
		in.add(4);
		in.add(5);
		System.out.println(in.get());
	}

}
