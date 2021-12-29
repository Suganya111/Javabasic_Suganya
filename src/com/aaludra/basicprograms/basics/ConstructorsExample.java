package com.aaludra.basicprograms.basics;

public class ConstructorsExample {
	/*
	 * the program is simple and easy to understand. There is two types of
	 * constructors on program, one is non parameterized constructor another one is
	 * parameterized constructor both the constructors were used in this program. To
	 * call the constructors not need to create new variable we can simply add the
	 * new keyword in front of the constructor name in main method. So the objects
	 * in line 25 and 26 are not used.
	 * 
	 */
	String language;

	public ConstructorsExample() {
		language = "Computer Science";
		System.out.println("Default Constructor called " + language);
	}

	public ConstructorsExample(String lang) {
		this.language = lang;
		System.out.println("Parametrized Constructor called " + language);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ConstructorsExample();
		new ConstructorsExample("Java");
	}

}
