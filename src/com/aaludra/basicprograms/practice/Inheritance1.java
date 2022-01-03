package com.aaludra.basicprograms.practice;

public class Inheritance1 extends Looping {
	public int add(int a, int b) {
		return a + b;
	}

	public int add(int a, int b, int c) {
		return a + b + c;
	}

	public float add(float a, float b) {
		return a + b;
	}

	public float add(float a, float b, float c) {
		return a + b;
	}
	public static void main(String[] args) {
		Looping l = new Inheritance1();
		System.out.println(l.getName());



	}

}
