package com.aaludra.basicprograms.basics;

public class OperatorsExample {
	/*
	 * usage of \n token will reduce the code writing time
	 */

	public void increment() {
		int i = 10, j = 20;
		System.out.println(i++ + "\n" + i + "\n" + ++j + " \n" + j);

	}

	public void decrement() {
		int i = 30, j = 40;
		System.out.println(i-- + "\n" + i + "\n" + --j + " \n" + j);

	}

	public void arithmetic() {
		int i = 10, j = 2;

		System.out.println(i + j);
		System.out.println(i - j);
		System.out.println(i * j);
		System.out.println(i / j);
		System.out.println(i % j);
	}

	public void and() {
		int a = 50, b = 45;
		boolean result = false;
		if (a > 10 & b < 20)
			result = true;
		System.out.println(result);
		if (a > 10 && b < 20)
			result = true;
		System.out.println(result);
	}

	public void or() {
		int a = 50, b = 45;
		boolean result = false;
		if (a > 10 | b < 20)
			result = true;
		System.out.println(result);
		if (a > 10 || b < 20)
			result = true;
		System.out.println(result);
	}

	public void assignment() {
		int a = 50, b = 45;
		System.out.println(a == b);// checking with assignment operator
		System.out.println(a += 100);
		System.out.println(b += 200);
	}

	public void shift() {
		int a = 10, b = 20;
		System.out.println(a >> 3);// right shift (Divide operation)
		System.out.println(b << 2);// left shift(Multiplication operation)
	}

	public void ternary() {
		int a = 10, b = 20;
		System.out.println(a + b > 50 ? true : false);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OperatorsExample operator = new OperatorsExample();
		operator.increment();
		operator.decrement();
		operator.arithmetic();
		operator.and();
		operator.or();
		operator.assignment();
		operator.shift();
		operator.ternary();
	}

}
