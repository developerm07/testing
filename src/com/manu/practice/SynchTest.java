package com.manu.practice;

public class SynchTest {

		public static void main(String[] args) throws Exception {
		ThreadExamples tx= new ThreadExamples();
		Runnable run1=()->{
			tx.sayHello();
			try {
				tx.getCount(10);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		};
		Runnable run2=()->{
			//	tx.sayHello();
			try {
				tx.getCount(10);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		};
		Runnable run3=()->{
			tx.sayHello();
		try {
			tx.getCount(10);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	};
		
		Thread t1= new Thread(run1);
		Thread t2= new Thread(run1);
		//Thread t3= new Thread(run3);
		t1.setName("T1");
		t2.setName("T2");
		//t3.setName("T3");
		t1.start();
		t2.start();
		//t3.start();
	}

	
	
}
