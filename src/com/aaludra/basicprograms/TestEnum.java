package com.aaludra.basicprograms;

/*
 * no error in this program
 */
public class TestEnum {
	Directions side;

	public static void main(String[] args) {

		for (Directions d : Directions.values()) {
			System.out.println(d);
		}
		System.out.println(Directions.valueOf("North"));
		System.out.println("Index of South in the Enum Directions is : " + Directions.valueOf("South").ordinal());

		Directions.South.state();
		Directions.East.state();
		Directions.West.state();
		Directions.North.state();

	}
}