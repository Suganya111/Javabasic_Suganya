package com.aaludra.basicprograms;

public class ModifierExample {
	private static int a = 10;// can be accessed only in this class
	public static String name = "Suganya";// can be accessed anywhere in the class and package
	protected static float f = 3.14f;// can be accessed anywhere in the same package and also accessable
	// if only if it is a subclassof other package class

	public static void print() {
		System.out.println(a);
		System.out.println(name);
		System.out.println(f);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print();

	}

}
