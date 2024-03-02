package com.manu.practice;

import java.util.HashSet;
import java.util.Set;

public class Example {
	public static void main(String[] args) {
		/*EmployeKey e1= new EmployeKey("1", "10051986");
		EmployeKey e2= new EmployeKey("1", "10051986");
		
		Set<EmployeKey> s= new HashSet<>();
		s.add(e1);
		s.add(e2);
		System.out.println("Set values are "+s.toString());*/
		
		String s1= "Hello";
		String s2= new String("Hello").intern();
		System.out.println(s1==s2);
		
	}

}


