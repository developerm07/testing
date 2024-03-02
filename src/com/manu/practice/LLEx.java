package com.manu.practice;

import java.util.ArrayList;
import java.util.List;

public class LLEx {
public static void main(String[] args) {
	
	MyList m1= new MyList();
	m1.add(6);
	m1.add(8);
	m1.add(9);
	m1.add(10);	
	m1.add(11);	
	System.out.println("Middle is >> "+m1.getMiddle());
	
	
	final List <String> finalList= new ArrayList<String>();
	finalList.add("hello");
	finalList.add("hi");
	
	sayHello(finalList);
	
}

private static void sayHello(List<String> finalList) {
	// TODO Auto-generated method stub
	//finalList.add(12);
}

}
