package com.sunbeam;

import java.util.Arrays;
import java.util.Scanner;

////3. Write a program to print no of comparisions done to search a key in
// ii. binary search
public class Q3BInarySearch {

	public static int binarySearch(int arr[], int n, int key, int left, int right)
	{
		
		int mid = (left + right)/2;
		int comp =0;
		while(left<=right)
		{
			comp++;
			if(key == arr[mid])
				return comp;
			else if(key < arr[mid])
				return binarySearch(arr, n, key, left, mid-1 );
			else
				return binarySearch(arr, n, key, mid+1, right);
		}
		return -1;
	}

	public static void main(String[] args)
	{
		int arr[]= {11,22,33,44,55,66,77,88,99};
		
		System.out.println("Array for Binary Search :" + Arrays.toString(arr));
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter key to Search :");
		int key = sc.nextInt();
		int result = binarySearch(arr, arr.length, key, 0, arr.length-1);
		System.out.println("Total Comparisons :" + result);
		
		
		
		
	}
}

