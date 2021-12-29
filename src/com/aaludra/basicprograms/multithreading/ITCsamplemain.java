package com.aaludra.basicprograms.multithreading;

public class ITCsamplemain {

	public static void main(String args[]) {
		final ITCSample c = new ITCSample();
		new Thread() {
			public void run() {
				c.withdraw(15000);
			}
		}.start();
		new Thread() {
			public void run() {
				c.deposit(10000);
			}
		}.start();

	}
}
