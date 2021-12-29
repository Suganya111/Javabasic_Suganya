package com.aaludra.basicprograms.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ExternalizeRunner {

	public static void main(String[] args) throws Exception {

		serialize();
		deserialize();

	}

	private static void serialize() throws Exception {
	
		try {
			FileOutputStream fos=new FileOutputStream("person.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			PersonExternalize p = new PersonExternalize();
			p.setName("Suganya");
			p.setEmail("suganya@aaludra.com");
			p.setPassword("12345");
			oos.writeObject(p);
			oos.flush();
			oos.close();
			System.out.println("Successful Serialization");
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

	private static void deserialize() {
		try {
			FileInputStream fis = new FileInputStream("person.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);

			PersonExternalize s = (PersonExternalize) ois.readObject();

			System.out.println("After Deserialization " + s.name + " " + s.email + " " + s.password);

			ois.close();

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
