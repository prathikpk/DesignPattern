package com.Aurionpro.model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class SingletonTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		OutputStream file = new FileOutputStream("./lib/code.test");
		ObjectOutputStream out = new ObjectOutputStream(file);
		out.writeObject(Singleton.getInstance());
		file.close();
		System.out.println("object serialized: " + Singleton.getInstance().hashCode());

		FileInputStream file1 = new FileInputStream("./lib/code.test");
		ObjectInputStream in = new ObjectInputStream(file1);
		Singleton readObject = (Singleton) in.readObject();
		file1.close();
		System.out.println("object Deserialized :" + readObject.hashCode());

//		System.out.println(Singleton.getInstance().hashCode());
//		System.out.println(Singleton.getInstance().hashCode());

	}

}
