package com.aaludra.basicprograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample1 {
	

	public static void main(String[] args) {
		String word="Tamil Tamilan TamilNadu 641035$%#^&";
		
		Pattern p=Pattern.compile("Tamil+");
		Matcher m=p.matcher(word);
		while(m.find())
		{
			System.out.println(m.group()+" starts at "+m.start());
		}

	}

}
