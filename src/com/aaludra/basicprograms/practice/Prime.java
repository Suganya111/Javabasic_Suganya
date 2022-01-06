package com.aaludra.basicprograms.practice;

public class Prime {

	public static void main(String args[]) {

		int n = 4507;
		int m = n / 2;
		boolean flag = true;
		if (n == 0 || n == 1) {
			System.out.println("Neither prime nor composite");
		}
		for (int i = 2; i <= m; i++) {
			if (n % i == 0) {
				flag = false;
				System.out.println(n + " is not a prime number");
				break;
			}
		}
			if (flag == true)
				System.out.println(n + " is a prime number");


	}
	}