package com.auribises;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		
		//Map<Integer, String> map = new HashMap<Integer, String>(); 
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(101, "John");
		map.put(112, "Jennie");
		map.put(543, "Jim");
		map.put(342, "Jack");
		map.put(876, "Joe");
		
		map.put(112, "Fionna");
		
		map.put(765, "Jack");
		
		map.put(null, "Leo"); // we can have a null key
		map.put(333, null); // we can have a null value
		
		System.out.println(map);
		
		String nm = map.get(101);
		System.out.println(nm);
		
		System.out.println(map.size());
		
		//map.remove(101);
		//map.clear();
		
		if(map.containsKey(112)){
			System.out.println("112 is in the map");
		}
		
		if(map.containsValue("Leo")){
			System.out.println("Leo is in the map");
		}
		
		// Iteration in Map
		Set<Integer> keys = map.keySet(); // Obtain all the keys from the map
		System.out.println(keys);
		
		Iterator<Integer> itr = keys.iterator();
		while(itr.hasNext()){
			Integer key = itr.next();
			String value = map.get(key);
			System.out.println(key+"\t"+value);
		}
		
		// Thread-Safe
		Hashtable<Integer, String> table = new Hashtable<Integer, String>();
		table.put(101, "John");
		table.put(112, "Jennie");
		table.put(543, "Jim");
		table.put(342, "Jack");
		table.put(876, "Joe");
		//table.put(null, "Harry"); null key not allowed here
		//table.put(901, null);     null value not allowed here
		
		System.out.println(table);
	}

}
