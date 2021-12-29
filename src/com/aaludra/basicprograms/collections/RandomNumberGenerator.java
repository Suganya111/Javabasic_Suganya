package com.aaludra.basicprograms.collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Random;

public class RandomNumberGenerator {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		LinkedList<Integer> ll = new LinkedList<>();

		int len = 5;
		Random random = new Random();
		System.out.println("New Random Number Generated");
		for (int i = 0; i < len; i++) {
			Integer randomNumber = random.nextInt(0000, 9999);

			pq.add(randomNumber);
			ll.add(randomNumber);
			System.out.println(randomNumber);

		}
		System.out.println("Priority queue: " + pq);
		System.out.println("Linked list: " + ll);
		Collections.sort(ll);
		System.out.println("Linked list after sorting: " + ll);



	}

}
