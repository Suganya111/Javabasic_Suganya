package com.aaludra.basicprograms;

public class StudentWrapper implements Comparable<StudentWrapper> {
	Integer rollno;
	String name;
	double marks;// Wrapper class is used because of using comparable interface for sorting out

	StudentWrapper(int rollno, String name, double marks) {
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public int compareTo(StudentWrapper s) {
		return this.rollno.compareTo(s.rollno);

	}

	@Override
	public String toString() {
		  return "StudentWrapper{"
		            + "RollNo=" + rollno + ", Name='" + name + '\''
		            + ", Marks=" + marks + '}';
	
		}
	}
