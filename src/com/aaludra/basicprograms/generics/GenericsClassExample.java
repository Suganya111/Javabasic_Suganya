package com.aaludra.basicprograms.generics;

public class GenericsClassExample<T> {
	
		T obj;

		public void add(T obj) {
			this.obj = obj;
		}

		T get() {

			return obj;
		}

}
