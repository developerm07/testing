package com.manu.practice;

import java.util.ArrayList;

public class HCTest {

	
	public static void main(String[] args) {
		String s1= "ABC";
		String s2="ABD";
		callTest(s1,s2);
	}

	private static void callTest(String string1, String string2) {
		ArrayList<String> l1= new ArrayList();
		ArrayList<String> l2= new ArrayList();
		
		ArrayList<String> tempList= new ArrayList<String>();
		String op1="";
		String op2="";
		
		
		for (int i=0; i<string1.length();i++) {
			l1.add(String.valueOf(string1.charAt(i)));
	
		}
		for(int j=0;j<string2.length();j++) {
			l2.add(String.valueOf(string2.charAt(j)));
		}
		
		
		//op1 dhould have characters which are on string 1 and not in string 2
		
		for (int j=0;j<l2.size();j++) {
				if(l1.contains(l2.get(j))) {
					tempList.add(l2.get(j));
				}
			
		}
	
		for (int i=0; i<l1.size();i++){
				
			if(!tempList.contains(l1.get(i))){
				op1=op1+l1.get(i);
			}
			
		}
		
		for (int j=0;j<l2.size();j++) {
			
			if(!tempList.contains(l2.get(j))){
				op2=op2+l2.get(j);
			}
		}
		
		
		
	
		
		System.out.println("Op1 is ==> "+op1);
		System.out.println("Op2 is ==> "+op2);
		
		
		
	}
	
}
