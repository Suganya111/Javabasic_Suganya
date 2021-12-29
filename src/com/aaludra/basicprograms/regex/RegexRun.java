package com.aaludra.basicprograms.regex;

public class RegexRun {
	public static void main(String[] args) {
		RegexInterface r = new RegexMain();

		System.out.println(r.validateRegex("Java is the programming Language", "Java"));
	}

}
