package com.day4;

//1. Implement a singly linear linked list with head and tail pointer. Implement addFirst(), addLast(),
//delFirst(), delLast, display() operations

public class linearLinkedListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List l1 = new List();
		
		l1.addFirst(10);
		l1.addFirst(20);
		l1.addLast(30);
		l1.addLast(40);
		l1.addLast(50);
		
		l1.deleteFIrst();
		l1.deleteLast();
		l1.display();

	}

}
