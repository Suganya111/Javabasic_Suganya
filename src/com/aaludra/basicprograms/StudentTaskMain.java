package com.aaludra.basicprograms;

import java.util.ArrayList;
import java.util.List;


public class StudentTaskMain {
	static String grade;

	public static String UpdateGrade(double percentage) {
		if (percentage >= 9) {
			grade = "A";
		} else if (percentage >= 8) {
			grade = "B";
		} else if (percentage >= 7) {
			grade = "C";
		} else if (percentage >= 6) {
			grade = "D";
		} else if (percentage >= 5) {
			grade = "E";
		} else
			grade = "fail";
		return grade;

	}
	public static void main(String[] args) {


		List<Student> list = new ArrayList<>();

		list.add(new Student("Nivetha", 5.3));
		list.add(new Student("Moshika", 9.3));
		list.add(new Student("Suganya", 6.3));
		list.add(new Student("Chithra", 3.3));
		list.add(new Student("Jamuna", 7.3));
		list.add(new Student("Sumathi", 8.3));

		for (Student lists : list) {
			UpdateGrade(lists.percentage);
		}
		

	}

}
