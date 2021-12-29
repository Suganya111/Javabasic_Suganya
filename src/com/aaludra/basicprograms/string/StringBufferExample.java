package com.aaludra.basicprograms.string;

/*
 * all methods in stringbuffer are used in this program
 */
public class StringBufferExample {
	public static void display() {
		StringBuffer sb = new StringBuffer("Hello ");
		System.out.println(sb.capacity());
		sb.append("World");
		sb.insert(4, "JAva");
		sb.replace(4, 6, "Python");
		sb.delete(4, 6);
		sb.reverse();

		// System.out.println(sb.capacity());
		sb.insert(4, "ProgrammingLanguages");

	}

	public static void main(String[] args) {

		display();
	}

}
