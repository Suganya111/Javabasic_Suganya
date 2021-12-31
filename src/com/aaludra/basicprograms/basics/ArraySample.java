package com.aaludra.basicprograms.basics;

public class ArraySample {
	/*
	 * The codings looks simple and efficient
	 */

	public static void print() {

		for (int i = 10; i >= 1; i--) {
			if (i % 2 != 0) {
				{
					System.out.println(i);
				}
			} else {
				for (int j = 10; j >= i; j--) {

					System.out.print(i + " ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print();
		int[] a = { 3, 5, 7 };
		System.out.println(a[0] + a[1] + a[2]);
		// int a = 10;
		// int b = 10;
		// System.out.println(a + b);
	}

}
