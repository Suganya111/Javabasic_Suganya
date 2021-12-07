package com.aaludra.basicprograms;

public class MethodOverloading {
	public static int multiply(int a, int b) {//
		return a * b;
	}

	public static int multiply(int a, int b, int c) {// method overloading with three parameters
		return a * b * c;
	}

	public static int multiply(int a, int b, int c, int d) {
		return a * b * c * d;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(multiply(2, 3));
		System.out.println(multiply(3, 4, 5));
		System.out.println(multiply(4, 5, 6, 7));
	}

}
