package com.aaludra.basicprograms;

public class DatatypeExample {
	/*
	 * Used all primitive datatypes in java except short and boolean, instead of
	 * simply print those variables performing simple operations are better. line 22
	 * is not neccesary instead of using this line we can use \n to get new line
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short s = -1;
		boolean b = true;
		int i = 5;
		float f = 10.45f;
		String name = "Suganya";
		String num = "1234";
		char ch = 'A';
		long mobileNum = 8870569353l;
		int[] array = { 1, 2, 3, 4, 5 };
		for (int j = 0; j < array.length; j++) {
			System.out.print(array[j] + " ");
		}
		System.out.println();
		System.out.println("Integer Value is " + i + "\nFloat value is " + f + "\nString value is " + name
				+ "\nString num " + num + "\nCharacter value " + ch + "\nMobile number is " + mobileNum + "\nBoolean : "
				+ b + " \nShort : " + s);

	}
}
