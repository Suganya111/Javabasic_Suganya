package com.aaludra.basicprograms.oopsconcept;

/*
 * comment on main class
 */
public interface SampleInterface {
	int i = 10;

	void abstractshow();

	static void staticshow() {
		System.out.println("In interface static methods can be accessed");
	}

	default void defaultshow() {
		System.out.println("In interface default methods can be accessed");
		privateshow();
	}

	private void privateshow() {
		System.out.println("Private methods can also be accessed in private method");
	}

}
