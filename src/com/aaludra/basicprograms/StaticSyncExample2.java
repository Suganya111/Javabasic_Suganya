package com.aaludra.basicprograms;

public class StaticSyncExample2 extends Thread {

	public void run() {
		StaticSyncExample1.printTable(1);
	}
}

