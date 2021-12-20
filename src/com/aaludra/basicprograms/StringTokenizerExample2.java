package com.aaludra.basicprograms;

/*
 * we can also use boolean value after the delimiter to print the delimiter too
 */
import java.util.StringTokenizer;

public class StringTokenizerExample2 {

	public static void main(String[] args) {

		StringTokenizer st = new StringTokenizer("Demonstrating. methods. from. StringTokenizer class", ".", true);
		System.out.println(st.countTokens());
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
