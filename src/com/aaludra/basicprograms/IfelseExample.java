package com.aaludra.basicprograms;

import java.util.Scanner;

public class IfelseExample {
	/*
	 * Close scanner class after you got all required user inputs. Use camal class
	 * while name method
	 */
	Scanner sc = new Scanner(System.in);

	public void check() {
		System.out.println("Enter mark");
		int marks = sc.nextInt();
		if (marks < 50) {
			System.out.println("fail");
		} else if (marks >= 50 && marks < 60) {
			System.out.println("D grade");
		} else if (marks >= 60 && marks < 70) {
			System.out.println("C grade");
		} else if (marks >= 70 && marks < 80) {
			System.out.println("B grade");
		} else if (marks >= 80 && marks < 90) {
			System.out.println("A grade");

		} else if (marks >= 90 && marks < 100) {
			System.out.println("A+ grade");

		} else {
			System.out.println("Invalid!");
			sc.close();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IfelseExample example = new IfelseExample();
		example.check();

	}

}
