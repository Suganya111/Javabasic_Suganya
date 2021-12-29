package com.aaludra.basicprograms.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNumEmailValidation {
	public void mobileValidation(String mobile) {

		Pattern p = Pattern.compile("(0|91-)?[6-9][0-9]{9}");
		Matcher m = p.matcher(mobile);
		boolean b = m.matches();

		if (b) {
			System.out.println("valid mobile number");
		} else {
			System.out.println("Not valid mobile number");
		}
	}

	public void emailValidation(String email) {

		Pattern p = Pattern.compile("^[a-zA-Z0-9+_.-]+@(.+)$");
		Matcher m = p.matcher(email);
		boolean b = m.matches();
		System.out.println("Email Id valid: " + b);

	}

	public static void main(String[] args) {


		MobileNumEmailValidation m = new MobileNumEmailValidation();
		m.mobileValidation("8870569353");
		m.emailValidation("suganyababu1110.#$@gmail.com");

	}

}
