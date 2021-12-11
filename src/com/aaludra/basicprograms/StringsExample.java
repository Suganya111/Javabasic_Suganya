package com.aaludra.basicprograms;

import java.util.Scanner;

public class StringsExample {
	/*
	 * close scanner classs after got all user inputs
	 * 
	 */

	Scanner sc = new Scanner(System.in);
	String check = "JAVA";
	String check1 = "java";

	public void stringmethods() {

		System.out.println("Enter string 1 : ");
		String s1 = sc.next();

		System.out.println("Enter String 2: ");
		String s2 = sc.next();
		String s3 = s1.concat(s2);
		System.out.println(s3);
		System.out.println(s1.equals(s2));
		System.out.println(s3.isEmpty());
		System.out.println(s3.substring(4, 14));
		System.out.println(s1.toUpperCase());
		System.out.println("Checking upper and lower case eqquality" + check.equalsIgnoreCase(check1));
		System.out.println(s3.replace('a', 'e'));
		System.out.println();
		sc.close();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringsExample example = new StringsExample();
		example.stringmethods();
	}

}
