package com.day4;

public class List {
	static class Node{
		private int data;
		private Node next;
		
		
		private Node(int value)
		{
		data = value;
		next = null;
		}
	}
	private Node tail;
	private Node head;
	public List()
	{
		head = null;
		tail = null;
	}
	
	public boolean isEmpty()
	{
		return head==null;
		
	}
	
	public void addFirst(int value)
	{	Node newNode = new Node(value);

		if(isEmpty())
		{
			head = newNode;
			tail = newNode;
		}
		else
		{
		newNode.next = head;
		
		head = newNode;	
		}
	}
	
	public void addLast(int value)
	{
		Node newNode = new Node(value);
		if(isEmpty())
		{
			head = tail = newNode;
		}
		else
		{
			tail.next = newNode;
			tail = newNode;
		}
		
	}
	
	public void deleteFIrst() {
		if(isEmpty())
		{
			return;
		}
		else {
			head = head.next;
		}
	}
	
	public void deleteLast()
	{
		if(isEmpty())
		{
			return;
		}
//		else if(head.next == null)
//		{
//			head = null;
//			tail = null;
//		}
		else
		{
			Node trav = head;
			while(trav.next != tail)
			{
				trav = trav.next;
			}
			trav.next= tail;
			tail = trav;
		}
	}
	
	public void display()
	{
		Node trav = head;
		
		System.out.println("LIST : ");
		
		while(trav != null)
		{
			System.out.print(" "+trav.data );
			trav = trav.next;
		}
		
		System.out.println(" ");
	}

}
