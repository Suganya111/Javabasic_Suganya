package com.aaludra.basicprograms;

public class EncapsulationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EncapsulationExample example = new EncapsulationExample();
		example.setId(10);
		example.setNum(20);
		System.out.println("Setting ID " + example.getId());
		System.out.println("Setting Num " + example.getNum());

		example.show();
	}

}
