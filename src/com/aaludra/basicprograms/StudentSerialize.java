package com.aaludra.basicprograms;

import java.io.Serializable;

public class StudentSerialize implements Serializable {

	private static final long serialVersionUID = 1L;
	String name;
	int age;
	int id;

	public StudentSerialize(String name, int age, int id) {

		this.name = name;
		this.age = age;
		this.id = id;
	}

}
