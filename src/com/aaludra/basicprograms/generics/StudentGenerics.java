package com.aaludra.basicprograms.generics;

public class StudentGenerics {
	private int id;
	private String name;
	private int mark;

	public int getId() {
		return id;
	}



	public String getName() {
		return name;
	}



	public int getMark() {
		return mark;
	}



	public StudentGenerics(int id, String name, int mark) {

		this.id = id;
		this.name = name;
		this.mark = mark;
	}

	@Override
	public String toString() {
		return "StudentGenerics id=" + getId() + ", name=" + getName() + ", mark=" + getMark();
	}

}
