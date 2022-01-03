package com.aaludra.basicprograms.enumprogram;

public class EnumException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	enum Sample {
		INR("India", "Rs"), USD("USA", "$"), EURO("Europe", "Euro");

		Sample(String country, String currency) {
			this.country = country;
			this.currency = currency;
		}

		String country;
		String currency;

		public static void getCurrency(String name) {
			try {
				for (Sample value : Sample.values()) {

					if (value.country.equals(name)) {

						System.out.println(value.currency);
					}
					throw new EnumException();
				}

			} catch (EnumException e) {
				System.out.println("No data found");
			}

		}

		public static void getCountry(String symbol) {
			try {
				for (Sample value : Sample.values()) {

					if (value.currency.equals(symbol)) {

						System.out.println(value.country);
					}
					break;
				}
				// throw new EnumException();
			} catch (Exception e) {
				System.out.println("No data found");
			}

		}

	}

	public static void main(String[] args) {

		Sample.getCurrency("India");
		// Sample.getCountry("$");

	}

//	public static void main(String[] args) {
//
//		Sample s = Sample.getCurrency("Asia");
//		System.out.println(s.currency);
//
//	}
}
