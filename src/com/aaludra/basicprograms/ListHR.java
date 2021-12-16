package com.aaludra.basicprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListHR {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<>(n);
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}
		int q = sc.nextInt();
		for (int i = 0; i < q; i++) {
			String command = sc.next();
			if (command.equals("Insert")) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				list.add(x, y);
			} else if (command.equals("Delete")) {
				int x = sc.nextInt();
				list.remove(x);
			}
		}

	}

}
