package com.aaludra.basicprograms.multithreading;

public class StaticSyncExample4 extends Thread {

	public void run() {
		StaticSyncExample1.printTable(100);
	}
}

