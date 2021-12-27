package com.aaludra.basicprograms;

public class SyncRunner2 {

	public static void main(String args[]) {
		SyncBlock1 obj = new SyncBlock1();// only one object
		MyThread1 t1 = new MyThread1(obj);
		MyThread2 t2 = new MyThread2(obj);
		t1.start();
		t2.start();

	}

}
