package com.aaludra.basicprograms.generics;

import java.util.Arrays;
import java.util.List;

//We did not specify the class so we are taking object class s the parent class
public class GenericsBoundedExample1 {


	public static void add(List<? super Integer> list) {
		for (Object o : list) {
			System.out.println(o);
		}
	}

	public static void print(List<? extends Number> list) {
		for (Number n : list) {
			double sum = 2.9;
			sum = +n.doubleValue();
			System.out.println(sum);
		}
	}

	public static void main(String[] args) {

//Lower Bounded for Integer is Integer and Number
		List<Integer> al = Arrays.asList(5, 10, 50, 32);
		List<Number> nal = Arrays.asList(1.0, 4.7, 3.5, 6.8);
		add(al);
		add(nal);

		// It shows compile time error because add method is specifically
		// for Integer and its super class, float does not belong to it
//		List<Float> fal = Arrays.asList(5.2f, 10.5f, 50.3f, 32.1f);
//		add(fal);

		// Upper Bounded for Number is Integer,Float,Double,Long
		List<Integer> ual = Arrays.asList(5, 10, 50, 32);

		List<Float> ual3 = Arrays.asList(1.0f, 4.7f, 3.5f, 6.8f);
		List<Double> ual4 = Arrays.asList(5.0, 10.0, 50.0, 32.0);
		print(ual);
		print(ual3);
		print(ual4);

	}
}
