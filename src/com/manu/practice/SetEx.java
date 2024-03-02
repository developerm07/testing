package com.manu.practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class SetEx {

	/*public static void main(String[] args) {
		HashSet<String> hs  = new HashSet<>();
		hs.add("Hello"); //69609650
		hs.add("HELLO");
		hs.add("hello");
		hs.add("");
		
		Iterator it=hs.iterator();
		while(it.hasNext()) {
			System.out.println("Values are --> "+it.next().hashCode());
		}
		
		
	}*/
	
	public static void main(String[] args) {
		HashMap<String,String> hm = new HashMap<>();
		hm.put("1", "Hello");
		hm.put("2", "Hi");
		Set<String> keys=hm.keySet();
		for(String key:keys) {
			System.out.println(key.hashCode());
			System.out.println("String Value is "+hm.get(key).hashCode());
		}
	}
	
}
