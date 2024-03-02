package com.manu.practice;

public class SharedResource1 {

	public  void sayHello() {
		synchronized(SharedResource1.class) {
		System.out.println("SharedResource1 Thread Name "+Thread.currentThread().getName() +" Says Hello");
		//Thread.sleep(10000);
		}
		
		System.out.println("SharedResource1 Thread Name "+Thread.currentThread().getName() +" Says Hello");
		
		//SharedResource2 sh2= new SharedResource2();
		//sh2.sayBye();
	}
	
	public synchronized void sayBye() {
		System.out.println("SharedResource1 says bye"+Thread.currentThread().getName() );
	}
	
}
