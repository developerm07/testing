package com.manu.practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class TestPrograms {

	public static void main(String[] args) {
		/*AtomicInteger a1 = new AtomicInteger(123);
		 int expectedVlaue=123;
		 int newValue=234;
		 //a1.compareAndSet(expectedVlaue, newValue);
		 a1.getAndAdd(newValue);
		 System.out.println("Value is --> "+a1);*/
		List<String> l1 = new ArrayList<>();
		l1.add("A1");
		l1.add("A2");
		l1.add("A3");
		System.out.println("Before size is --> "+l1.size());
		Iterator<String> itr = l1.iterator();
		while (itr.hasNext()) {
		    String a = itr.next();
		    if(a.equals("A1")) {
		    	itr.remove();
		    }
		}
		System.out.println("After size is --> "+l1.size());
		for (int i=0;i<l1.size();i++) {
			System.out.println("Values are --> "+l1.get(i));
		}
		
	}
	
}
