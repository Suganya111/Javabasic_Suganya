package com.aaludra.basicprograms;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TransientSerialRunner {

	public static void main(String[] args) throws Exception {

		serialize();
		deserialize();

	}

	private static void deserialize() throws Exception {
		try {
			FileInputStream fis = new FileInputStream("TrasientExample.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			TransientSerialExample1 t = (TransientSerialExample1) ois.readObject();
			System.out.println("DeSerialization Successful......Data After Deserialization");

			System.out.println("Id is " + t.id);
			System.out.println("Name is " + t.name);
			System.out.println("a is " + TransientSerialExample1.a);
			System.out.println("b is " + t.b);
			ois.close();
			fis.close();
		}

		catch (Exception e) {
			System.out.println(e);
		}

	}

	private static void serialize() throws Exception {
		TransientSerialExample1 tse = new TransientSerialExample1(53, "Suganya", 2, 20);
		try {
			FileOutputStream fos = new FileOutputStream("TrasientExample.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(tse);
			oos.flush();
			oos.close();
			fos.close();

			System.out.println("Serialization Successful......Data before Deserialization");

			System.out.println("Id is " + tse.id);
			System.out.println("Name is " + tse.name);
			System.out.println("a is " + TransientSerialExample1.a);
			System.out.println("b is " + tse.b);
			tse.name = "Jamuna";
			TransientSerialExample1.a = 5;
			tse.b = 30;
		}

		catch (Exception e) {
			System.out.println(e);
		}

	}

}
