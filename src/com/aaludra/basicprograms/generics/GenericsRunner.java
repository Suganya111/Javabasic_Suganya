package com.aaludra.basicprograms.generics;

import java.util.ArrayList;
import java.util.List;

//"?"-WildCardEntry is used to specify accepting any data type
public class GenericsRunner {
//This method accepts any class under ShapeGenerics class , if any 
	// class not belong to shapegenerics this method will not be executed
	public static void addShape(List<? extends ShapeGenerics> list) {
		for (ShapeGenerics s : list) {
			s.draw();
		}
	}

	public static void main(String[] args) {
		List<CircleGenericsExample> list = new ArrayList<CircleGenericsExample>();
		list.add(new CircleGenericsExample());
		list.add(new CircleGenericsExample());
		list.add(new CircleGenericsExample());
		List<SquareGenericsExample> list1 = new ArrayList<SquareGenericsExample>();
		list1.add(new SquareGenericsExample());
		list1.add(new SquareGenericsExample());

		addShape(list);
		addShape(list1);

	}

}
