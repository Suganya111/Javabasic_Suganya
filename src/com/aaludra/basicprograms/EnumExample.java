package com.aaludra.basicprograms;

public class EnumExample {

	public enum Grade {
		A("Grade A", "5000 to 10000"), B("Grade B", "10000 to 20000"), C("Grade C", "30000 to 40000");

		String gradevalue, salary;

		Grade(String gradevalue, String salary) {
			this.gradevalue = gradevalue;
			this.salary = salary;
		}

		public static Grade getSalary(String grade) {
			for (Grade g : Grade.values()) {
				if (g.gradevalue.equals(grade)) {
					return g;
				}
			}
			return null;
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Grade val = Grade.getSalary("A");
			System.out.println(val.salary);
		}

	}
}


