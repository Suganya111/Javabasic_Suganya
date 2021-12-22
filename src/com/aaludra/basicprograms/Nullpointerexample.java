package com.aaludra.basicprograms;

public class Nullpointerexample {
	public static void method() throws CustomException {

			String str = null;
			System.out.println(str.length());
			throw new CustomException("No data");

}

	public static void main(String[] args) {
		try {
		method();
		} catch (CustomException e) {
			System.out.println(e.getMessage());

		}
	}
}
