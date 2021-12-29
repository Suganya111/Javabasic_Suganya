package com.aaludra.basicprograms.enumprogram;

/*
 * comments on main class
 */
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

		System.out.println("Tamil Nadu");
	}

}
