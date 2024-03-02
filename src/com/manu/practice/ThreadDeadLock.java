package com.manu.practice;

public class ThreadDeadLock {

	public static void main(String[] args) {
		SharedResource1 sh1= new SharedResource1();
		SharedResource2 sh2= new SharedResource2();
		
		Thread t1=new Thread(new Runnable() {
			
			@Override
			public void run() {
				sh1.sayHello();
			}
		});
		
Thread t2=new Thread(new Runnable() {
			
			@Override
			public void run() {
				sh1.sayHello();
				sh1.sayBye();
			}
		});

		t1.start();
		t2.start();
	}
	
}
