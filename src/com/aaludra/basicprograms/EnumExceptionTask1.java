package com.aaludra.basicprograms;

public class EnumExceptionTask1 {
	
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

			public static void getException() throws NoDataFoundException {
				try {
					Sample s = getCurrency("India");
					System.out.println(s.currency);

				} catch (NullPointerException e) {
					throw new NoDataFoundException("No data found");

				}
			}
		}

		public static void main(String[] args) throws NoDataFoundException {
			try {
				Sample.getException();

			} catch (NoDataFoundException e) {
				System.out.println(e.getMessage());
			}
		}
	}


