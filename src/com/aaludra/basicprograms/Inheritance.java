package com.aaludra.basicprograms;

public class Inheritance extends InheritanceExample {
	float bonus = 10000;

	public void getBonus() {
		float totalBonus = bonus + EmployeeSalary;
		System.out.println("The total bonus for the employee " + EmployeeName + "is " + totalBonus);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inheritance example = new Inheritance();
		example.getDetails();
		example.getBonus();
	}

}
