package com.poonam.designPattern;

class SingleLinkedList  {
	Node head;
	int size =100;

	static  class Node {
		static int data;
		Node next;
		public void meth()
		{
			System.out.println("Welcome to Inner Class");
		}
	}

	public Node add(Node newNode) {
		return newNode;
	}

	public boolean isEmpty() {
		if (head == null)
			return true;
		return false;
	}
public int length(SingleLinkedList list){
	
	return size;	
}
}

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleLinkedList.Node  s =new SingleLinkedList.Node();
		s.meth();
		
		
		
	}

}
