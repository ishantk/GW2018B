package com.auribises.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

import com.auribises.model.Student;

public class Client {

	public static void main(String[] args) {

		Student s1 = new Student(101,"John","john@example.com",30,"Redwood Shores");
		Student s2 = new Student(201,"Fionna","fionna@example.com",32,"Country Homes");
		
		//System.out.println(s1);
		//System.out.println(s2);
		
		String str1 = s1.toString()+"\n";
		String str2 = s2.toString()+"\n";
		
		// Code : which will save the data of an object in a file
		// We wish to perform persistance
		
		try {
			
			//File file = new File("/Users/ishantkumar/Downloads/eveningstudents1.txt");
			/*if(file.exists()){
				System.out.println(file.getName()+" exists !!");
			}else{
				System.out.println(file.getName()+" does not exists !!");
			}*/
			
			// Write the data in File
			// Data is in bytes
			//FileOutputStream fos = new FileOutputStream(file);
			/*FileOutputStream fos = new FileOutputStream(file,true); // true -> append mode
			fos.write(str2.getBytes());
			fos.close();*/
			
			
			// Data is in text
			/*FileWriter writer = new FileWriter(file);
			writer.write(str1);
			writer.write(str2);
			writer.close();*/
			
			// Read the data in the form of bytes
			//File file = new File("/Users/ishantkumar/Downloads/Conditions.java");
			/*FileInputStream fis = new FileInputStream(file);
			
			int i = 0;
			int count = 0;
			
			while( (i = fis.read()) != -1){
				char ch = (char)i;
				System.out.print(ch);
				
				if(ch == 'i'){
					count++;
				}
			}
			
			System.out.println("i found "+count+" times");
			
			fis.close(); // to release memory
			*/
			
			File file = new File("/Users/ishantkumar/Downloads/Conditions.java");
			FileReader reader = new FileReader(file);
			BufferedReader buffer = new BufferedReader(reader);
			
			String line = "";
			
			int count = 0;
			
			while((line = buffer.readLine()) != null){
				System.out.println(line);
				
				if(line.contains("if(")){
					count++;
				}
			}
			
			System.out.println("if condition found: "+count);
			
			buffer.close();
			reader.close();
			
			//System.out.println("==Contents Written==");
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
		
		
		
	}

}
