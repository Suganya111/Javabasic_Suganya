package com.aaludra.basicprograms;

import java.util.Scanner;

public class SwitchExample {
	int a = 20;
	int b = 30;
	Scanner sc = new Scanner(System.in);

	public void display() {
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println();
		System.out.println("Enter your choice");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println(a + b);
			break;
		case 2:
			System.out.println(a - b);
			break;
		case 3:
			System.out.println(a * b);
			break;
		case 4:
			System.out.println(a / b);
			break;

		}

	}

	public static void main(String[] args) {

		SwitchExample example = new SwitchExample();
		example.display();
	}

}
