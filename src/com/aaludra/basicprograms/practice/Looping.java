package com.aaludra.basicprograms.practice;

public class Looping {
	static int n = 10;
	private String name;

	public static void show() {
		System.out.println(n++);
		for (int i = 1; i <= n; i++) {
			System.out.print(i);
		}
		System.out.println();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void display() {
		for (int i = 1; i <= n; ++i) {
			System.out.print(i);
		}
		System.out.println();
	}

	public static void run() {
		int i = 1;
		while (i <= n) {
			System.out.print(i);
			i++;
		}
		System.out.println();
	}

	public static void print() {
		int j = 1;
		while (j <= n) {
			System.out.print(j);
			++j;
		}

	}

}
