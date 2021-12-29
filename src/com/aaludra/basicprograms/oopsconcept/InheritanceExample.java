package com.aaludra.basicprograms.oopsconcept;

public class InheritanceExample {
	private int age = 27;
	int employeeSalary = 40000;
	int employeeId = 53;
	String employeeName = "Suganya";

	public void getDetails() {
		System.out.println("The Name of the Employee: " + employeeName);
		System.out.println("The Id of the Employee: " + employeeId);
		System.out.println("The Salary: " + employeeSalary);

	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}


