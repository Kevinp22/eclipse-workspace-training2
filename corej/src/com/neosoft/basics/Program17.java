package com.neosoft.basics;

public class Program17 {
	
	class Node{
		int data;
		Node previous;
		Node next;
		public Node(int data) {
			super();
			this.data = data;
		}
	}
	
	Node head ,tail=null;
	
	public void addNode(int data) {
		Node Nodenew=new Node(data);
		 if(head==null) {
			 head=tail=Nodenew;
			 head.previous=null;
			 tail.next=null;
		 }
		 else {
			 tail.next=Nodenew;
			 Nodenew.previous=tail;
			 tail=Nodenew;
			 tail.next=null;
			 
		 }
		
	}
	public void display() {
		
		Node Current=head;
		if(head==null) {
			System.out.println("List in empty");
			return;
			
		}
		System.out.println(" Nodes are");
		while(Current!=null) {
			System.out.println(Current.data+" ");
			Current=Current.next;
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Program17 p=new Program17();
p.addNode(1);
p.addNode(2);
p.addNode(3);
p.addNode(4);
p.addNode(5);
p.display();
	}

}
