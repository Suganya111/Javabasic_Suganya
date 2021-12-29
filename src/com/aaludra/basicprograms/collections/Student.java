package com.aaludra.basicprograms.collections;

public class Student {

	private String name;
	private String grade;
	private double percentage;

	Student(String name, double percentage) {
		this.name = name;
		this.percentage = percentage;
	}

	public String getName() {
		return name;
	}


	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public double getPercentage() {
		return percentage;
	}


}
