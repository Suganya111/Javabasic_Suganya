package com.aaludra.basicprograms.basics;

public class WhileExample {
	public void print() {
		int i = 2;
		int mul = 1;
		while (i < 11) {
			System.out.println(i);
			mul = mul * i;
			System.out.println("Multiplication value " + mul);
			i++;
		}

	}
	public static void main(String[] args) {

		WhileExample example = new WhileExample();
		example.print();
	}

}
