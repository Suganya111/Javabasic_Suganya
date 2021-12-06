package com.aaludra.basicprograms;

public class ClassesExample {
	private int noOfStudents = 100;

	public void department() {
		String dept = "Computer Science";
		System.out.println("There are " + noOfStudents + " in " + dept + " department");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassesExample example = new ClassesExample();
		example.department();
	}

}
