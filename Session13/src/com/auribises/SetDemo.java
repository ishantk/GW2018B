package com.auribises;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("John");		//0
		list.add("Jennie");
		list.add("John");
		list.add("Jim");
		list.add("Jack");
		list.add("Jennie");
		list.add("Joe");			//n-1
		
		System.out.println(list);
		
		//Set<String> set = new HashSet<String>();
		//HashSet<String> set = new HashSet<String>();
		
		TreeSet<String> set = new TreeSet<String>(); // Sort the data
		
		set.add("John"); 		// hashcode1
		set.add("Jennie");
		set.add("John");
		set.add("Jim");
		set.add("Jack");
		set.add("Jennie");
		set.add("Joe");			//hashcode2
		
		System.out.println(set);
		
		System.out.println(set.size());
		
		if(set.contains("John")){
			System.out.println("John is in the Set");
		}

		set.remove("John");
		
		System.out.println(set);
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()){
			String nm = itr.next();
			System.out.println(nm);
		}
		
		
	}

}
