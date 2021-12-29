package com.aaludra.basicprograms.oopsconcept;

public class EncapsulationExample {
	//Encapsulation means Data hiding
	// If we declare a private variable other class cannot access it
	// We can use getter and setter files instead to access private variables this
	// is called Encapsulation
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	private int add(int a, int b) {
		int add = a + b;
		return add;

	}

	public void show() {
		System.out.println(add(5, 5));// Accessing private method by creating a
		// public method in same class and calling that particular method in another
		// class

	}


}
