package com.aaludra.basicprograms;

import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedList {

	public static void main(String args[]) {
		Queue<Integer> pQueue = new LinkedList<Integer>();

		pQueue.add(10);
		pQueue.add(20);
		pQueue.add(15);

		System.out.println("Peek method to print the fist element in the Queue " + pQueue.peek());

		System.out.println("Poll method to delete the first element in the queue: " + pQueue.poll());

		System.out.println("Now printing the first element in the queue: " + pQueue.peek());
	}
}


