package com.aaludra.basicprograms.multithreading;

public class ThreadRunner {

	public static void main(String[] args) throws InterruptedException {
		ThreadExample1 t1 = new ThreadExample1();
		ThreadExample2 t2 = new ThreadExample2();
		System.out.println(t1.getState());
		t1.start();

		System.out.println(t1.getState() + " " + t1.getName() + " " + t1.getId() + " " + t1.getPriority());

		System.out.println(t1.getState());
		t2.start();
		t2.interrupt();
		System.out.println(t2.isAlive());
		System.out.println(t2.getState() + " " + t2.getName() + " " + t2.getId() + " " + t2.getPriority());

		for (int i = 0; i <= 3; i++) {


			System.out.println("Thread Runner " + i);
		}
	}

}
