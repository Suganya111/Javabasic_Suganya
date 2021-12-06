package com.aaludra.basicprograms;

public class MethodsExample {
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
		MethodsExample example = new MethodsExample();
		example.squareMethod();
	}

}
