package com.aaludra.basicprograms.practice;

public class Laptop extends Desktop {
	Laptop() {
		System.out.println("Charge on");
	}

	Laptop(String brand) {
		super(brand);
		System.out.println(brand);
	}

	public static void main(String[] args) {
		Laptop l = new Laptop();
		Laptop b = new Laptop("HP");
	}

}
