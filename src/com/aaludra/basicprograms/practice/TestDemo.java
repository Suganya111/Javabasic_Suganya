package com.aaludra.basicprograms.practice;

import java.util.Objects;

public class TestDemo {
	int id;
	String name;

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		TestDemo other = (TestDemo) obj;
//		return id == other.id && Objects.equals(name, other.name);
//	}

	public static void main(String[] args) {

		TestDemo t = new TestDemo();
		t.id = 10;
		t.name = "Suganya";
		System.out.println(t.hashCode());
	}

}
