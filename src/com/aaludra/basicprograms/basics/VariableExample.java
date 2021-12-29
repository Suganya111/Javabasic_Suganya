package com.aaludra.basicprograms.basics;

public class VariableExample {
	static String name = "Aaludra"; // static variable can be used anywhere in the class
	int i = 5;// instance variable is created when object is created and destroyed when obj is
				// destroyed

	public void print() {
		int id = 4509;
		name = "saranya";
		System.out.println(i + "\n" + name);
		System.out.println(id);// local variable can be accessed only by its method
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		VariableExample value = new VariableExample();
		value.print();
	}

}
