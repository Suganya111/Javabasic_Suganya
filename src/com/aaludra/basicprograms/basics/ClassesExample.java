package com.aaludra.basicprograms.basics;

public class ClassesExample {
	/*
	 * output verified, the private variable accessed by it's own classe's method
	 * department() and the method accessed by the boject example.department();
	 */
	private int noOfStudents = 100;

	public void department() {
		String dept = "Computer Science";
		System.out.println("There are " + noOfStudents + " in " + dept + " department");
	}

	public static void main(String[] args) {

		ClassesExample example = new ClassesExample();
		example.department();
	}

}
