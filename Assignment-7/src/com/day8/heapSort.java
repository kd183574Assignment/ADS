package com.day8;

public class heapSort {
	private int SIZE;
	
	public heapSort(int size)
	{
		SIZE = 0;
	}
	
	public void addHeap(int arr[])
	{
		SIZE++;
		
		int ci = SIZE;
		int pi = ci/2;
		
		while(pi >= 2)
		{
			if(arr[pi]>arr[ci])
				break;
			//if parent is less than child then swap both
			int temp = arr[pi];
			arr[pi] = arr[ci];
			arr[ci] = temp;
			//update parent and child both index
			
			ci = pi;
			pi = ci/2;
		}
	}
	
	public int deleteHeap(int arr[])
	{
		int max = arr[1];
		arr[1] = arr[SIZE];
		arr[SIZE] = max;
		SIZE --;
		
		//compare root with descendant
		
		int pi = 1;
		int ci = pi*2;
		while(ci <= SIZE)
		{
			if(ci+1 <= SIZE && arr[ci + 1] > arr[ci])
				ci= ci+1;
			
			if(arr[pi]> arr[ci])
				break;
			
			int temp = arr[pi];
			arr[pi] = arr[ci];
			arr[ci] = temp;
			
			pi = ci;
			ci = pi*2;
			
		}
		return max;
		
	}
	
	public void heapSOrt(int arr[])
	{
		for(int i = 1; i<arr.length;i++)
			addHeap(arr);
		for(int i =1; i<arr.length ; i++)
			deleteHeap(arr);
	}
}
