package com.aaludra.basicprograms;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeExample {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		try {
			FileInputStream fin = new FileInputStream("Serial.txt");
			ObjectInputStream ois = new ObjectInputStream(fin);
			StudentSerialize in = (StudentSerialize) ois.readObject();
			ois.close();
			fin.close();
			System.out.println(in.id + " " + in.age + " " + in.name);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
