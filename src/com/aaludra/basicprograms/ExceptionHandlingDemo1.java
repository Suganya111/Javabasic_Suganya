package com.aaludra.basicprograms;

public class ExceptionHandlingDemo1 {

	public static void main(String[] args) {
		// Divide By Zero Arithmetic exception
		int c;
		try {
			c = 3 / 0;
			System.out.println(c);
		} catch (ArithmeticException e) {
			e.printStackTrace();

		}
		System.out.println("Program finished");

		System.out.println();
		// ArrayIndexOutOfBoundException
		int[] a = new int[3];
		try {
			a[3] = 4;
		} catch (IndexOutOfBoundsException ib) {
			System.out.println("Please check the array length");
		}
		// IndexoutOfBoundException
		String[] arr = new String[3];
		try {
			arr[3] = "Apple";
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
