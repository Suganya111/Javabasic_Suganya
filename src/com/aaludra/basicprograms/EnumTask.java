package com.aaludra.basicprograms;

public class EnumTask {
	enum Sample {
		INR("India", "Rs"), USD("USA", "$"), EURO("Europe", "Euro");

		Sample(String country, String currency) {
			this.country = country;
			this.currency = currency;
		}

		String country, currency;

		public static Sample getCurrency(String name) {
			for (Sample value : Sample.values()) {
				if (value.country.equals(name)) {

					return value;
				}
			}
			return null;
		}
	}

	public static void main(String[] args) {

		Sample s = Sample.getCurrency("India");
		System.out.println(s.currency);

	}
}
