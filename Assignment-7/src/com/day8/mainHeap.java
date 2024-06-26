package com.day8;

import java.util.Arrays;

public class mainHeap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {6,14,3,26,8,18,21,9,5};
		
		heapSort h = new heapSort(arr.length);
		System.out.println("Array before Sorting :" + Arrays.toString(arr));
		
		h.heapSOrt(arr);
		
		System.out.println("After Sorting :" + Arrays.toString(arr));
		

	}

}

