package com.aaludra.basicprograms.practice;

public class Fibonacci {
	public void printFibonocci() {
		int a = 0;
		int b = 1;
		int n = 10;
		System.out.print(a + " " + b + " ");
		for (int i = 0; i < n; i++) {

			int fib = a + b;
			System.out.print(fib + " ");
			a = b;
			b = fib;
		}

	}

	public static void main(String[] args) {
		Fibonacci f = new Fibonacci();
		f.printFibonocci();

	}

}
