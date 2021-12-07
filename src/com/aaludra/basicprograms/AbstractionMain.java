package com.aaludra.basicprograms;

public class AbstractionMain extends AbstractionExample {
	@Override
	public void display() {
		System.out.println("Abstract methods overrided");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractionMain main = new AbstractionMain();
		main.display();
		main.show();
		System.out.println("The variable that is mentioned in abstract class " + main.a);

	}

}
