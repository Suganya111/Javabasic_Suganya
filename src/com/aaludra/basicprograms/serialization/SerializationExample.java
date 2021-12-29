package com.aaludra.basicprograms.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationExample {
	public static void main(String[] args) throws IOException, FileNotFoundException {
		StudentSerialize student = new StudentSerialize("Suganya", 27, 53);
		try {
			FileOutputStream f = new FileOutputStream("Serial.txt");
			ObjectOutputStream oos = new ObjectOutputStream(f);
			oos.writeObject(student);
			oos.flush();
			oos.close();
			f.close();
			System.out.println("Success Serialization");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
