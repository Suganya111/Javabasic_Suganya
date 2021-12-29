package com.aaludra.basicprograms.serialization;

import java.io.Serializable;

public class TransientSerialExample1 implements Serializable {
	int id;
	String name;
	transient static int a;
	transient int b;

	public TransientSerialExample1(int id, String name, int a, int b) {

		this.id = id;
		this.name = name;
		TransientSerialExample1.a = a;
		this.b = b;
	}

}
