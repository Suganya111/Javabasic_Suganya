package com.aaludra.basicprograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMain implements RegexInterface {

	
	public boolean validateRegex(String input, String regex) {

		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(input);
		return m.matches();
	}

	
	

}
