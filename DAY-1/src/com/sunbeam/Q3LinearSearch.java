package com.sunbeam;

import java.util.Arrays;
import java.util.Scanner;

//3. Write a program to print no of comparisions done to search a key in
//i. linear search 
public class Q3LinearSearch {
	
	public static int linearSearch(int arr[], int n, int key)
	{
		int comp=0;
		for(int i=0; i<n; i++)
		{
			comp++;
			if(key == arr[i])
				return i;
		}
		
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {88, 33, 66, 99, 11, 77, 22,55,14};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Key :");
		int key = sc.nextInt();
		int result = linearSearch(arr, arr.length, key);
		System.out.println("Total Comparisons :" + result );

	
	}
}
