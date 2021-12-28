package com.aaludra.basicprograms;

public class Employee {
	int id;
	String name;
	String city;
	String designation;
	double salary;
	int yoj;

	public Employee(int id, String name, String city, String designation, double salary, int yoj) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.designation = designation;
		this.salary = salary;
		this.yoj = yoj;
	}

//A class can have two main methods using method Overloading, program for checking two main method 
	public static void main(int a) {
		System.out.println("Main method 1");
	}

	public static void main(String[] args2, String[] args1) {
		System.out.println("Main method 2");
		main(3);
	}

}
