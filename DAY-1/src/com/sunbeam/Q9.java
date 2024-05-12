package com.sunbeam;

import java.util.Arrays;

//9. Write a selection sort function to sort array and returns no of comparisions
public class Q9 {
	
	public static void SelectionSort(int arr[], int n) {
		int comparisons =0;
		int passes = 0;
		for(int i=0; i<n-1; i++)
		{	passes++;
			for(int j=i+1; j<n; j++)
			{	comparisons++;
				if(arr[i]>arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j]= temp;
					
				}
			}
			
		}
		System.out.println("No. of Comparisons :" + comparisons);
		System.out.println("No. of Passes :" + passes);
		
	}
	
	
	public static void main(String[] args)
	{
		int arr[]= {44,11,55,22,66,33};
		
		System.out.println("Array Before Sorting :" + Arrays.toString(arr));
		SelectionSort(arr, arr.length);
		System.out.println("Array After Sorting :" + Arrays.toString(arr));
	}

}
