package com.aaludra.basicprograms;

public class EnumTask {
	enum CountryWithCurrency {
		INR("India", "Rs"), USD("USA", "$"), EURO("Europe", "Euro");

		private CountryWithCurrency(String country, String currency) {
			this.country = country;
			this.currency = currency;
		}

		private final String country;
		private final String currency;


		public String getCountry() {
			return country;
		}


		public String getCurrency() {

			return currency;
		}
		public void getCurrency1(String country)
		{
			CountryWithCurrency values[] = CountryWithCurrency.values();
			for (CountryWithCurrency value : values) {
				if(this.country==country)
				{
					System.out.println(currency);
				}
			}
		}

		CountryWithCurrency cwc;

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			EnumTask task = new EnumTask();



		}



	}

}
