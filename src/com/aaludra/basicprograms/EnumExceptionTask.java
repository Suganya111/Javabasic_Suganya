package com.aaludra.basicprograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EnumExceptionTask {

	enum Sample {
		INR("India", "Rs"), USD("USA", "$"), EURO("Europe", "Euro");

		Sample(String country, String currency) {
			this.country = country;
			this.currency = currency;
		}

		String country;
		String currency;

		public static Sample getCurrency(String name) {

			for (Sample value : Sample.values()) {
				if (value.country.equals(name))
					return value;
			}
			return null;
		}

		public static void getException() throws NullPointerException, NoDataFoundException, InvalidInputException {


			String input = "India";
			Pattern p = Pattern.compile("^[A-Za-z]{3,10}$");
				Matcher m = p.matcher(input);

				boolean b = m.matches();
				if (!b) {
					throw new InvalidInputException("Invalid data");
				} else {

					try {
					Sample s = getCurrency(input);

					System.out.println(s.currency);
				} catch (NullPointerException e) {
					throw new NoDataFoundException("No data found");
				}

			}
			}
	}
	public static void main(String[] args) throws NoDataFoundException, NullPointerException, InvalidInputException {
		try {
			Sample.getException();

		} catch (NoDataFoundException e) {
			System.out.println(e.getMessage());
		}
		catch (InvalidInputException e) {
			System.out.println(e.getMessage());
	}
}
}
