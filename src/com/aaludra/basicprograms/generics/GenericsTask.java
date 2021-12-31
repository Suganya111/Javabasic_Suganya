package com.aaludra.basicprograms.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericsTask {

	public static <T> void toString(List<T> obj) {
		Iterator<T> itr = obj.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}
		System.out.println();

	}


	public static void main(String[] args) {

		List<StudentGenerics> studList = new ArrayList<StudentGenerics>();

		studList.add(new StudentGenerics(53, "Suganya", 98));
		studList.add(new StudentGenerics(55, "Moshika", 99));
		studList.add(new StudentGenerics(51, "Jamuna", 89));

		toString(studList);

		List<EmployeeGenerics> empList = new ArrayList<EmployeeGenerics>();

		empList.add(new EmployeeGenerics(21, "Chithra", 20000));
		empList.add(new EmployeeGenerics(23, "Sumathi", 50000));
		empList.add(new EmployeeGenerics(25, "Aarthi", 15000));

		toString(empList);
		List<AccountGenerics> accList = new ArrayList<AccountGenerics>();

		accList.add(new AccountGenerics("Chithra", 601007161, "Coimbatore"));
		accList.add(new AccountGenerics("Sumathi", 50006760, "Rajapalayam"));
		accList.add(new AccountGenerics("Aarthi", 1500434320, "Chennai"));

		toString(accList);
	}

}
