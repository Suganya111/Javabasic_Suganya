package com.aaludra.basicprograms.multithreading;

public class ThreadExample1 extends Thread {
	@Override
	public void run() {
		Thread.yield();
		for (int i = 0; i <= 5; i++) {
			System.out.println("Thread 1 class " + i);
		}
	}

}
