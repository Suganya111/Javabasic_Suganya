package com.aaludra.basicprograms;

public class EnumException2 {
	enum Sample {
		INR("India", "Rs"), USD("USA", "$"), EURO("Europe", "Euro");

		Sample(String country, String currency) {
			this.country = country;
			this.currency = currency;
		}

		String country;
		String currency;

		public static void getCurrency(String name) {
			for (Sample value : Sample.values()) {
				if (value.country.equals(name)) {
					System.out.println(value.currency);
				}

			}
	}
	}
	public static void main(String[] args) throws CustomException {
		try {
			Sample.getCurrency("India");
			throw new CustomException("No data");
	}
	catch (CustomException e) {
		System.out.println(e.getMessage());
	}
}
}
