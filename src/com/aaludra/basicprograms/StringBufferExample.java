package com.aaludra.basicprograms;

public class StringBufferExample {
	public static void display()
	{
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
		// TODO Auto-generated method stub
		display();
	}

}
