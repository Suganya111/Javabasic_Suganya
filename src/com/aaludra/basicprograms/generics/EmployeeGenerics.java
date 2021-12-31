package com.aaludra.basicprograms.generics;

public class EmployeeGenerics {
	private int id;
	private String name;
	private float salary;

	public int getId() {
		return id;
	}



	public String getName() {
		return name;
	}



	public float getSalary() {
		return salary;
	}



	public EmployeeGenerics(int id, String name, float salary) {

		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeGenerics id=" + getId() + ", name=" + getName() + ", salary=" + getSalary();
	}


}
