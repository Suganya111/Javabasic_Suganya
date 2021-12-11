package com.aaludra.basicprograms;

public class Inheritance extends InheritanceExample {
	/*
	 * in 7th line the variable value is in integer form but the declared datatype
	 * is float there is no error on the program but declaring accurate datatype is
	 * important
	 */
	float bonus = 10000.0f;

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
