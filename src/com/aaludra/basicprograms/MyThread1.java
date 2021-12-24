package com.aaludra.basicprograms;

public class MyThread1 extends Thread {
	SyncBlock1 t;

	MyThread1(SyncBlock1 t) {
		this.t = t;
	}

	public void run() {
		t.printTable(5);
	}

}
