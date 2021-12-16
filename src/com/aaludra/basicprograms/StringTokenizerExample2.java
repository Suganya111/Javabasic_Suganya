package com.aaludra.basicprograms;

import java.util.StringTokenizer;

public class StringTokenizerExample2 {

	public static void main(String[] args) {

		StringTokenizer st = new StringTokenizer("Demonstrating. methods. from. StringTokenizer class", ".");
		System.out.println(st.countTokens());
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
