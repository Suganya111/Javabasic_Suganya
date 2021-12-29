package com.aaludra.basicprograms.enumprogram;


public enum Grade {
	A("Grade A", 5000, 9000), B("Grade B", 10000, 19000), C("Grade C", 20000, 30000);

	String gradevalue;
	int salarystart;
	int salaryend;

	Grade(String gradevalue, int salarystart, int salaryend) {
		this.gradevalue = gradevalue;
		this.salarystart = salarystart;
		this.salaryend = salaryend;
	}

	public static boolean validateSalaryRange(String value, int salary) {
		for (Grade g : Grade.values()) {
			if (g.salarystart == salary || g.salaryend == salary) {
				return true;
			}
		}
		return false;
	}
}
/*
 * public static Grade getSalary(String grade) { for (Grade g : Grade.values())
 * { if (g.gradevalue.equals(grade)) { return g; } } return null; }
 */




