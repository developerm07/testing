package com.manu.practice;

import java.util.LinkedList;

public class UseMe {

	 LinkedList<Integer> list = new LinkedList<>(); 
     int capacity = 5; 
     
     /**
      * Producer method to populate list
      * @throws InterruptedException
      */
     public void produce() throws InterruptedException 
     { 
         int value = 0;
         while (value<20) { 
             synchronized (this) 
             { 
            	 if (list.size() == capacity) {
            		 wait();
            	} 

              System.out.println("Producer produced- "+ value); 
              list.add(value++); 
              notify(); 
              Thread.sleep(1000); 
             }
         
     } 
        System.out.println("<<Producer thread terminated ...>>");
     }
     
     
     public void consume() throws InterruptedException{
    	 boolean value= true;
    	 int i=0;
    	 while (value) { 
    		 i++;
            synchronized (this) 
             { 
                 if (list.size() == 0) {
                	 if(i>19) {
                    	 value=false;
                     }
                	 wait();
                 }
                 // to retrive the ifrst job in the list 
                 int val = list.removeFirst(); 

                 System.out.println("Consumer consumed- " +val); 
                
                 notify(); 
                 Thread.sleep(1000); 
             } 
         } 
    	System.out.println("<< Consumer thread got terminated >>"); 
     }


	/*public void stop() {
		// TODO Auto-generated method stub
		int exit=0;
	}*/
	
}
