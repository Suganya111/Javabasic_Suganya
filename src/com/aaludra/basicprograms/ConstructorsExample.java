package com.aaludra.basicprograms;

public class ConstructorsExample {
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
		ConstructorsExample example = new ConstructorsExample();
		ConstructorsExample example1 = new ConstructorsExample("Java");
	}

}
