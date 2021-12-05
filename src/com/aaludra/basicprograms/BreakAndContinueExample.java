package com.aaludra.basicprograms;

public class BreakAndContinueExample {
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
			System.out.println(i);
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
