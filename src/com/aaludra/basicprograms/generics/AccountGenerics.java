package com.aaludra.basicprograms.generics;

public class AccountGenerics {
	private String accName;
	private int accNo;
	private String city;

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public long getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public AccountGenerics(String accName, int accNo, String city) {
		this.accName = accName;
		this.accNo = accNo;
		this.city = city;
	}

	@Override
	public String toString() {
		return "AccountGenerics [accName=" + getAccName() + ", accNo=" + getAccNo() + ", city=" + getCity() + "]";
	}

}
