package com.sunbeam;

import java.util.Arrays;

//1. Write a insertion sort function to sort array and returns no of comparisions.

public class que1 {
	
	public static void Insertion(int arr[], int n)
	{		int comp =0;
			int inComp =0;

		for(int i=1; i<n; i++)
		{
		comp++;
		int temp = arr[i];
		
		int j = i-1;
		
		while(j >=0 && temp< arr[j])
		{
			inComp++;
			arr[j+1] = arr[j];
			j--;
		}
		arr[j+1] = temp;
		}
		System.out.println("No. of Comparisons : "+ comp);
		
		System.out.println("No. of Inner Comparisons : " + inComp);
		
	}
	

	public static void main(String[] args) {
		int arr[]= {55,44,22,66,11,33};
		
		System.out.println("Before Sorting : " + Arrays.toString(arr));
		Insertion(arr, arr.length);
		System.out.println("After SOrting : " + Arrays.toString(arr));
		
		
	}

}
