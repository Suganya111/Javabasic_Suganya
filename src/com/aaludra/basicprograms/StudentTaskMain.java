package com.aaludra.basicprograms;

import java.util.ArrayList;

public class StudentTaskMain {

	static String grade;

	public static String updateGrade(double percentage) {
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

		String s;
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student("Aarthi", 8.9));
		list.add(new Student("Bama", 7.9));
		list.add(new Student("Chithra", 4.9));
		list.add(new Student("Durga", 3.9));
		list.add(new Student("Jamuna", 5.9));
		list.add(new Student("Indhu", 3.1));
		list.add(new Student("Moshika", 9.0));

		for (Student studentObject : list) {
			s = updateGrade(studentObject.getPercentage());
			studentObject.setGrade(s);

		}
		for (Student list1 : list) {
			System.out.println(list1.getName() + "       Grade " + list1.getGrade());
		}
	}
	}

