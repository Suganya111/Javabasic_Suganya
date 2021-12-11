package com.aaludra.basicprograms;

public class BreakAndContinueExample {
	/*
	 * no problem on output, used two method to show break and continue statements
	 * and called those methods in main function. on testcontinue() the continue
	 * statement is not neccesary it is not perform any operation in this case
	 * because the number is a part of the loop element. it's better to change the
	 * if condition to see the operation done by continue statement. Use camalcase
	 * to declare methods.
	 */
	public void testbreak() {
		System.out.println("Loop using break statement");
		for (int i = 11; i <= 20; i++) {
			System.out.println(i);
			if (i == 15)
				break;
		}
	}

	public void testcontinue() {
		System.out.println("Loop using Continue statement");
		for (int i = 11; i <= 20; i++) {
			System.out.print(i + " ");
			if (i == 15)
				continue;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BreakAndContinueExample example = new BreakAndContinueExample();
		example.testbreak();
		example.testcontinue();
	}

}
