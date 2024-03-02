package com.manu.practice;

public class ProducerConsumerEx {

	public static void main(String[] args) throws InterruptedException {
		
		UseMe um= new UseMe();
		
		
		Thread producerThread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					um.produce();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		
		Thread consumerThread= new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					um.consume();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		});
		
				
		producerThread.start();
		consumerThread.start();
		producerThread.join();
		consumerThread.join();
		
		
		
		
		/*System.out.println("Producer thread state is --> "+producerThread.getState());
		System.out.println("Producer thread state is --> "+consumerThread.getState());*/
		
	}
	
	
}
