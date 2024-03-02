package com.manu.practice;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadEx {
	//static AtomicInteger i=new AtomicInteger(10);
	volatile boolean flag = true;
	public static void main(String[] args) {
		ThreadEx ex = new ThreadEx();
		boolean flag = true;
		
		Thread t1=new Thread(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					try {
						while(flag) {
						System.out.println("Value of i in thread t1 is ");
						}
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
		Thread t2=new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					ex.setValue(false);
					System.out.println("Value of i in thread t2 is ");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		t1.start();
		t2.start();
		
	}

	private void setValue(boolean flag) {
		// TODO Auto-generated method stub
		this.flag=flag;
		
	}

	private boolean getValue() {
		return this.flag;
		
	}
	
	
	
}
