package com.aaludra.basicprograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMain implements RegexInterface {

	public static void main(String[] args) {
		RegexMain r=new RegexMain();
		System.out.println(r.validateRegex("Java is the programming Language","Java"));
	}

	@Override
	public boolean validateRegex(String input, String regex) {
		// TODO Auto-generated method stub
		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(input);
		boolean b=m.lookingAt();
			return b;
	}

	
	

}
