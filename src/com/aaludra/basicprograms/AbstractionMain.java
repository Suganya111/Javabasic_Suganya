package com.aaludra.basicprograms;

public class AbstractionMain extends AbstractionExample {
	/*
	 * no mistakes to point out
	 */
	int i=2;
	@Override
	public void display() {
		System.out.println("Abstract methods overrided");
	}
	public void print() {
		System.out.println(" Non Abstract methods overrided");
	}

	public static void main(String[] args) {

		AbstractionMain main = new AbstractionMain();
		main.display();
		main.show();
		main.print();
		System.out.println("The variable that is mentioned in abstract class " + main.a);
		System.out.println("The variable that is mentioned in abstract class " + main.i);
	}

}
