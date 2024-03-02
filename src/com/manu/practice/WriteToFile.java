package com.manu.practice;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class WriteToFile {

	public static void main(String[] args) throws Exception {
		
		SerializEx  s= new SerializEx();
		
		s.setName("Manohar");
		s.setSal("100");
		
		FileOutputStream fos = new FileOutputStream("Sz.txt"); 
		ObjectOutputStream oos = new ObjectOutputStream(fos);
	    oos.writeObject(s);
	    oos.close();
	    fos.close();
	    System.out.println("Serialzation Done!!"+s.toString());
		
		
	}
	
}
