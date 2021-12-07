package com.aaludra.basicprograms;

public enum Directions {
	North {
		@Override
		public void state() {
			System.out.println("Delhi");
		}
	},
	West {
		@Override
		public void state() {
			System.out.println("West Bengal");
		}
	},
	East {
		@Override
		public void state() {

			System.out.println("Bihar");
		}
	},
	South;

	void state() {
		// TODO Auto-generated method stub
		System.out.println("Tamil Nadu");
	}

}
