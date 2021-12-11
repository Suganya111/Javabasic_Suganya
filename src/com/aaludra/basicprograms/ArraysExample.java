package com.aaludra.basicprograms;

public class ArraysExample {
	/*
	 * The code structure looks simple and easily understandable instead of
	 * declaring the i<3; in for condition we can declare arrayName.length()
	 * function so it will be easy even if we change size if the array
	 */
	public void oneD() {
		int[] array1 = { 1, 2, 3 };
		int[] array2 = { 3, 4, 5 };
		int[] array3 = new int[3];
		System.out.println("One Dimensional Array");
		for (int i = 0; i < array1.length; i++) {
			array3[i] = array1[i] + array2[i];

		}
		for (int i = 0; i < array3.length; i++) {
			System.out.print(array3[i] + " ");

		}
		System.out.println();
	}

	public void twoD() {
		int[][] array1 = { { 1, 2, 3 }, { 3, 4, 5 }, { 1, 3, 5 } };
		int[][] array2 = { { 2, 4, 6 }, { 1, 4, 3 }, { 3, 4, 5 } };
		int[][] array3 = new int[3][3];
		System.out.println("Two Dimensional array");
		for (int i = 0; i < array3.length; i++) {
			for (int j = 0; j < array3.length; j++) {
				array3[i][j] = array1[i][j] * array2[i][j];
			}
		}
		for (int i = 0; i < array3.length; i++) {
			for (int j = 0; j < array3.length; j++) {
				System.out.print(array3[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArraysExample example = new ArraysExample();
		example.oneD();
		example.twoD();

	}

}
