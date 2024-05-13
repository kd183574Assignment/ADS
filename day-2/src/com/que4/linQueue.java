package com.que4;
//4. Write program to implement linear queue in which front and rear starts at 0.
public class linQueue {
	
	private int arr[];
	private int rear, front;
	private final int size;
	
	public linQueue(int size) {
		
		this.size = size;
		arr = new int[size];
		rear = front = 0;
		
	}
	
	
	public void push(int value)
	{
		rear++;
		arr[rear] = value;
	}
	
	public int pop()
	
	{
		front++;
		return arr[front];
		
	}
	public int peek()
	{
		return arr[front +1];
	}
	
	public boolean isFull()
	{
		return rear== size-1;
	}
	
	public boolean isEmpty()
	{
		return rear == front;
	}
	
	

}
