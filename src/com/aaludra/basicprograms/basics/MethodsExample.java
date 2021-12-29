package com.aaludra.basicprograms.basics;

public class MethodsExample {
	/*
	 * the static method squareMethod() from the type MethodsExample should be
	 * accessed in a static way
	 */
	static int num1 = 100, num2 = 101, add, square;

	public static int addMethod() {
		add = num1 + num2;
		return add;
	}

	public static void squareMethod() {
		addMethod();
		System.out.println(square = add * add);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodsExample.squareMethod();
	}

}
