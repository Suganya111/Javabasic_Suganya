package com.aaludra.basicprograms.oopsconcept;

/*Interface variables are static because java interfaces cannot be instantiated on their own
 * 'we have to access the variables using it's class name not with object'
 */
public class InterfaceMain implements SampleInterface {
	int j = 65;

	@Override
	public void abstractshow() {
		System.out.println("Abstract methods need to be instantiated by the other class which implements Interface");
	}

	public static void main(String[] args) {

		SampleInterface example;
		example = new InterfaceMain();
		System.out.println("The value of variables in Interface cannot be changed: " + example.i);
		example.defaultshow();
		SampleInterface.staticshow();// static methods can't accessed by objects so we are calling static methods by
										// Interface name

		example.abstractshow();
		System.out.println(example.i);

	}

}
