package com.auribises.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.auribises.model.Student;

public class SerializationClient {

	public static void main(String[] args) {
		
		//Student s1 = new Student(101,"John","john@example.com",30,"Redwood Shores");
		
		try {
			
			// Serialization
			// We save the state of an object in a file
			// state of an object is the data within an object
			/*File file = new File("/Users/ishantkumar/Downloads/mystudents.dat");
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(s1);
			
			System.out.println("Object Written..");*/
			
			// De-Serialization
			// We read the state of an object from a file, and create a new object in program
			
			File file = new File("/Users/ishantkumar/Downloads/mystudents.dat");
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Student sRef = (Student)ois.readObject();
			System.out.println(sRef); //System.out.println(sRef.toString());*/
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}

	}

}
