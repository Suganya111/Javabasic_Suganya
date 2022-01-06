package com.aaludra.basicprograms.practice;

import java.util.Scanner;

public class Histogram {
	Scanner sc = new Scanner(System.in);

	public void histo() {
		int n = 5;
		for (int i = 0; i < n; i++) {
			System.out.println();
			int m = sc.nextInt();


			for (int j = 0; j < m; j++) {
				System.out.print("* ");
			}
		}
	}

	public static void main(String[] args) {
		Histogram h = new Histogram();
		h.histo();

	}

}
