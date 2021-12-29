package com.aaludra.basicprograms.oopsconcept;

public class Inheritance extends InheritanceExample {
	/*
	 * in 7th line the variable value is in integer form but the declared datatype
	 * is float there is no error on the program but declaring accurate datatype is
	 * important
	 */
	float bonus = 10000.0f;

	public void getBonus() {
		float totalBonus = bonus + employeeSalary;
		System.out.println("The total bonus for the employee " + employeeName + "is " + totalBonus);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inheritance example = new Inheritance();
		example.getDetails();
		example.getBonus();
		example.setAge(4);
		System.out.println(example.getAge());
	}

}
