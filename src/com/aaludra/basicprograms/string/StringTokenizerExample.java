package com.aaludra.basicprograms.string;

import java.util.StringTokenizer;

/*
 * review comment on main class
 */
public class StringTokenizerExample {
	// String name="Java. is a programming Language.";

	public static void main(String[] args) {

		// StringTokenizerExample example=new StringTokenizerExample();
		StringTokenizer st = new StringTokenizer("Java is a programming Language");
		while (st.hasMoreElements()) {
			System.out.println(st.nextToken());
		}

		// System.out.println(st.st1.nextToken("."));
	}

}
