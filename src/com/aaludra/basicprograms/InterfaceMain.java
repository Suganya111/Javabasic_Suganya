package com.aaludra.basicprograms;

public class InterfaceMain implements SampleInterface {
	int i = 65;
	@Override
	public void abstractshow() {
		System.out.println("Abstract methods need to be instantiated by the other class which implements Interface");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SampleInterface example;
		example = new InterfaceMain();
		System.out.println("The value of variables in Interface cannot be changed: " + example.i);
		example.defaultshow();
		SampleInterface.staticshow();// static methods can't accessed by objects so we are calling static methods by
										// Interface name

		example.abstractshow();
		System.out.println(example.i);
	}

}
