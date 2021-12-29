package com.aaludra.basicprograms.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchesMethodRegex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern p=Pattern.compile("Java");
		Matcher m=p.matcher("Java");
		boolean b=m.matches();
		System.out.println(b);
		

	}

}
