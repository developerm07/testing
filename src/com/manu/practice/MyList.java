package com.manu.practice;

public class MyList {
	
	Node head;
	
	void add(int data) {
		Node node= new Node();
		node.data=data;
		node.next=null;
		if(head==null) {
			head=node;
		}else {
			Node n=head;
			while(n.next!=null) {
				n=n.next;
			}
			n.next=node;
		}
		
	}
	
	 int getMiddle() {
		Node slowRunner=head;
		Node fastRunner=head;
		while(fastRunner.next!=null) {
			fastRunner=fastRunner.next;
			if(fastRunner!=null&&fastRunner.next!=null) {
				slowRunner=slowRunner.next;
				fastRunner=fastRunner.next;
			}
			
		}
		
		
		return slowRunner.data;
	}
	
	void show() {
		Node n=head;
		while(n.next!=null) {
			System.out.println("Data in list --> "+n.data);
			n=n.next;
		}
		
		System.out.println("Last value is >> "+n.data);
		
	}
	
	
}
