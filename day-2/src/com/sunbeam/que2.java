package com.sunbeam;

import java.util.Arrays;

//2. Modify the insertion sort algorithm to sort the array in descending order
public class que2 {
	
	public static void descInser(int arr[], int n)
	{	int passes = 0;
		int comp = 0;
	
		for(int i=1; i<n; i++)
		{
			passes++;
			
			int temp = arr[i];
			int j = i-1;
			
			while(j>=0 && temp>arr[j])
			{comp++;
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1] = temp;
			
		}
		System.out.println("No. of Passes :" + passes);
		System.out.println("No. of COmparisons :" + comp);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {11,33,10,77,99,20};
		
		System.out.println("Array Before Sorting :" + Arrays.toString(arr));
		descInser(arr, arr.length);
		System.out.println("Array After SOrting :" + Arrays.toString(arr));
	}

}
