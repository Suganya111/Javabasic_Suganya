package com.aaludra.basicprograms;

public class ThreadExample2 extends Thread {
public void run()
{
	for(int i=1;i<=3;i++)
	{
		try {
			Thread.sleep(1000);

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("Interrupted during my sleep");
		}
		System.out.println("Thread 2 class "+i);
	}
}
}
