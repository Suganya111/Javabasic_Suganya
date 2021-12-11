package com.aaludra.basicprograms;

public class AbstractionMain extends AbstractionExample {
	/*
	 * no mistakes to point out
	 */
	@Override
	public void display() {
		System.out.println("Abstract methods overrided");
	}

	public static void main(String[] args) {

		AbstractionMain main = new AbstractionMain();
		main.display();
		main.show();
		System.out.println("The variable that is mentioned in abstract class " + main.a);

	}

}
