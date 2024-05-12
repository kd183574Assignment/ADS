package com.assign3;

public class stackDescending {
	private int arr[];
	private final int size;
	private int top;
	
	stackDescending(int size )
	{
		this.size = 0;
		size = size;
		top = size;
		arr = new int[size];
	}
	
	public void push(int value)
	{
		top--;
		arr[top]=value;
	}
	
	public int pop()
	{
		return arr[top++];
	}
	
	public boolean isEmpty()
	{
		return top == size-1;
	}
	
	public boolean isFull()
	{
		return top ==0;
	}


}

