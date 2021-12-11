package com.aaludra.basicprograms;

public class MethodOverridingMAin extends MethodOverriding {
	/*
	 * it's better if you perform any simple operations rather than simply print the
	 * statement
	 */
	@Override
	public void print() {
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println("Derived class executed :" + c);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverriding overriding;// Runtime Polymorphism
		overriding = new MethodOverridingMAin();// Dynamic Binding
		overriding.print();
		overriding = new MethodOverriding();// Dynamic Binding
		overriding.print();
		overriding.show();
	}

}
