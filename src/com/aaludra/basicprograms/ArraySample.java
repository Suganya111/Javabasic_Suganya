package com.aaludra.basicprograms;

public class ArraySample {
	public static void print() {

		for (int i = 10; i > 1; i--) {
			for (int j = 10; j >= i; j--) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print();
	}

}
