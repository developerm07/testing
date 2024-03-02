package com.manu.practice;

public class SharedResource2 {

	public synchronized void  sayHello() {
		System.out.println("SharedResource2 Thread Name "+Thread.currentThread().getName() +" Says Hello");
		//SharedResource1 sh1= new SharedResource1();
		//sh1.sayBye();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public synchronized void sayBye() {
		System.out.println("SharedResource1 says bye");
	}
	
}
