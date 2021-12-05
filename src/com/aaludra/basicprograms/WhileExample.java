package com.aaludra.basicprograms;

public class WhileExample {
	public void print() {
		int i = 2, mul = 1;
		while (i < 11) {
			System.out.println(i);
			mul = mul * i;
			System.out.println("Multiplication value " + mul);
			i++;
		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WhileExample example = new WhileExample();
		example.print();
	}

}
