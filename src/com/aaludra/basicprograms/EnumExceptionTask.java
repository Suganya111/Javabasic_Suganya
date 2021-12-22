package com.aaludra.basicprograms;

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

		public static void getException() throws CustomException {
			try {
				Sample s = getCurrency("India");
				System.out.println(s.currency);

			} catch (NullPointerException e) {
				throw new CustomException("No data found");

			}
		}
	}

	public static void main(String[] args) throws CustomException {
		try {
			Sample.getException();

		} catch (CustomException e) {
			System.out.println(e.getMessage());
		}
	}
}