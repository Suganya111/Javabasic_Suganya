package com.aaludra.basicprograms;

public class MyThread2 extends Thread {

	SyncBlock1 t;

	MyThread2(SyncBlock1 t) {
		this.t = t;
	}

	public void run() {
		t.printTable(10);

	}

}
