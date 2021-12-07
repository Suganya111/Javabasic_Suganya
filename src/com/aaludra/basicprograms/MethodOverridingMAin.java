package com.aaludra.basicprograms;

public class MethodOverridingMAin extends MethodOverriding {
	@Override
	public void print() {
		System.out.println("Derived class executed");

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverridingMAin overriding = new MethodOverridingMAin();
		overriding.print();
		overriding.show();
	}

}
