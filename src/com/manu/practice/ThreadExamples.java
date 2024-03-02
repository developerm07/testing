package com.manu.practice;

public class ThreadExamples {

	int i=0;	
	
	public synchronized void sayHello(){
	
		System.out.println("Current Thread "+Thread.currentThread().getName()+" says hello");
		
	}
	
	public   void getCount(int c) throws Exception{
		synchronized (this) {
			i=i+c;
			for(int i=0;i<10;i++) {
				
			}
			System.out.println("Current thread "+Thread.currentThread().getName()+" updating i value with "+c +" <<sum is >>"+i);
			
		}
		System.out.println("Current thread "+Thread.currentThread().getName());
		
	}
	
}
