package com.aaludra.basicprograms;

import java.util.Scanner;

public class ForExample {
	public void display() {
		int[][] array = new int[3][3];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				array[i][j] = sc.nextInt();
			}

		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.print(array[i][j] + " ");

			}
			System.out.println();

		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ForExample example = new ForExample();
		example.display();

	}

}
