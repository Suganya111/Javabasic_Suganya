package com.aaludra.basicprograms;

public class MethodOverridingMAin extends MethodOverriding {
	@Override
	public void print() {
		System.out.println("Derived class executed");

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
