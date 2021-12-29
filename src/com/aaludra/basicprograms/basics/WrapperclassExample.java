package com.aaludra.basicprograms.basics;

/*
 * If use the same variables to boxing and un-boxing it will be easy to understand the wrapper class
 * 
 */
public class WrapperclassExample {

	byte b = 2;
	boolean bool = true;
	char c = 'a';
	double d = 60.d;
	float f = 6.2f;
	int i = 10;
	long l = 3333333l;
	short s = 20;

	Byte b2 = b; // un-boxing

	Byte b1 = 20;
	Boolean bool1 = false;
	Character c1 = 'A';
	Double d1 = 36.D;
	Float f1 = 65.2F;
	Integer i1 = 45;
	Long l1 = 3435333L;
	Short s1 = 40;

	public void convertPrimitiveData() {
		Byte byteobj = b;
		Boolean booleanobj = bool;
		Character charobj = c;
		Double doubleobj = d;
		Float floatobj = f;
		Integer intobj = i;
		Long longobj = l;
		short shortobj = s;
		System.out.println("Byte AutoBoxing: " + byteobj + "\nBoolean AutoBoxing: " + booleanobj
				+ "\nCharacter AutoBoxing: " + charobj + "\nDouble AutoBoxing: " + doubleobj + "\nFloat AutoBoxing: "
				+ doubleobj + "\nLong AutoBoxing: " + longobj + "\nShort AutoBoxing: " + shortobj
				+ "\nInteger AutoBoxing: " + intobj + "\nFloat AutoBoxing: " + floatobj);

	}

	public void convertObjectData() {
		byte byp = b1;
		Boolean bop = bool;
		Character cop = c;
		Double dop = d;
		Float fop = f;
		Integer iop = i;
		Long lop = l;
		short sop = s;
		System.out.println("byte UnBoxing: " + byp + "\nboolean UnBoxing: " + bop + "\nchar UnBoxing: " + cop
				+ "\ndouble UnBoxing: " + dop + "\nFloat UnBoxing: " + dop + "\nlong UnBoxing: " + lop
				+ "\nshort UnBoxing: " + sop + "\nint UnBoxing: " + iop + "\nfloat UnBoxing: " + fop);

	}

	public static void main(String[] args) {

		WrapperclassExample example = new WrapperclassExample();
		example.convertPrimitiveData();
		example.convertObjectData();
	}

}
