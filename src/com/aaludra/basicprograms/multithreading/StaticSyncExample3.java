package com.aaludra.basicprograms.multithreading;

public class StaticSyncExample3 extends Thread {

	public void run() {
		StaticSyncExample1.printTable(10);
	}
}

