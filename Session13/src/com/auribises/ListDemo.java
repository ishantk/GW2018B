package com.auribises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

class Student{
	
	int roll;
	String name;
	
	public Student(){
		
	}
	
	public Student(int roll, String name) {
		this.roll = roll;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + "]";
	}
	
}

public class ListDemo {

	public static void main(String[] args) {
		
		Student s1 = new Student(1,"John");
		Student s2 = new Student(11,"George");
		Student s3 = new Student(17,"Fionna");
		
		//1. 
		//List list = new ArrayList();		// Polymorphic Statement
		
		//2.
		// Hetrogeneous
		ArrayList list1 = new ArrayList(); // Direct Statement | Raw Type
		
		// Homogeneous
		ArrayList<String> list2 = new ArrayList<String>(); // Direct Statement
		
		ArrayList<Student> list3 = new ArrayList<Student>(); // Direct Statement
		
		//ArrayList<Integer> list4 = new ArrayList<Integer>(); // Direct Statement
		
		
		//1. Add/Insert data in ArrayList
		//list1.add(0,"John"); 		// 0th index
		list1.add("John"); 		// 0th index
		list1.add("Jennie");
		list1.add(2.2);
		list1.add('A');
		list1.add(s1); 			// n-1 index
		
		list2.add("John");
		list2.add("Jennie");
		list2.add("Jim");
		list2.add("Jack");
		list2.add("John");
		list2.add("Joe");
		//list2.add(s1);
		//list2.add(100);
		
		list3.add(s1); //0
		list3.add(s2); //1
		list3.add(s3); //2
		
		// Get the Size
		System.out.println(list1.size());
		System.out.println(list2.size());
		System.out.println(list3.size());
		
		// Get the data from list
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list3);

		// Get only single element
		String name = list2.get(1);
		System.out.println("name is: "+name);
		
		Student sRef = list3.get(2);
		System.out.println(sRef);
		
		Object o = list1.get(1); // Run Time Polymorphism on Object Level
		System.out.println("o is: "+o);
		
		// Update the data in list
		System.out.println(list2);
		list2.set(1, "Sia"); // Update
		System.out.println("==================");
		System.out.println(list2);
		
		// Delete data from list
		list2.remove(1);
		System.out.println("==================");
		System.out.println(list2);
		
		//list2.clear();
		
		//System.out.println(list2);
		
		ArrayList names = new ArrayList();
		names.add("Mike");
		names.add("Leo");
		names.add("Harry");
		names.add("George");
		System.out.println("==================");
		list2.addAll(names);
		System.out.println(list2);
		
		// Iterate in the List
		//1. For Loop
		System.out.println("=======For Loop=====");
		for(int i=0;i<list2.size();i++){
			String nm = list2.get(i);
			System.out.println(nm);
		}
		
		//2. Enhanced For Loop
		System.out.println("=======Enhanced For Loop=====");
		
		for(String nm : list2){
			System.out.println(nm);
		}	
		
		System.out.println("------------");
		
		for(Object x : list1){
			System.out.println(x);
		}	
		
		//3. Iterator
		System.out.println("=======Iterator=====");		
		Iterator<String> itr = list2.iterator();
		while(itr.hasNext()){
			String nm = itr.next();
			System.out.println(nm);
			
			if(nm.equals("John")){
				itr.remove(); // removes John from the list2
			}
		}
		
		System.out.println(list2);
		
		//4. ListIterator
		System.out.println("=======ListIterator=====");
		ListIterator<String> listItr = list2.listIterator();
		while(listItr.hasNext()){
			String nm = listItr.next();
			System.out.println(nm);
			
			/*if(nm.equals("John")){
				itr.remove(); // removes John from the list2
			}*/
		}
		System.out.println("----");
		while(listItr.hasPrevious()){
			String nm = listItr.previous();
			System.out.println(nm);
			
			/*if(nm.equals("John")){
				itr.remove(); // removes John from the list2
			}*/
		}
		
		//5. Enumeration
		System.out.println("=======Enumeration=====");
		Enumeration<String> enm = Collections.enumeration(list2);
		while(enm.hasMoreElements()){
			String nm = enm.nextElement();
			System.out.println(nm);
		}
		
		if(list2.contains("Mike")){
			System.out.println("Mike is in the list");
		}
		
		int idx = list2.indexOf("Mike");
		System.out.println("Mike is at "+idx);
		
		// Thread-Safe
		Vector<String> vector = new Vector<String>();
		vector.add("Mike");
		vector.add("Leo");
		vector.add("Harry");
		vector.add("George");
	}

}
