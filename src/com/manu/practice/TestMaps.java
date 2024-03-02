package com.manu.practice;

import java.util.IdentityHashMap;
import java.util.Iterator;

public class TestMaps {
public static void main(String[] args) {
	
	IdentityHashMap<Employee, String> myMap= new IdentityHashMap<>();
	Employee e1= new Employee("ABC", "1");
	Employee e2= new Employee("ABC", "1");
	
	myMap.put(e1,"ABC");
	myMap.put(e2, "ABC");
	
	System.out.println("Map size is >> "+myMap.size());
	
	Iterator<Employee> empItr=myMap.keySet().iterator();
	
	while(empItr.hasNext()) {
		
		
		System.out.println(myMap.get(empItr.next()));
		Employee e3= new Employee("aaa", "3");
		myMap.put(e3, "AB");
		
		
	}
	
	
}
}
