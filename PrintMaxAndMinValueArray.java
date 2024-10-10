package com.selfstudy.arrays;

import java.util.Arrays;

public class PrintMaxAndMinValueArray {
//	public static void main(String[] args) {
//		int[] arr = {44,3,777,0,8999};
//		
//		Arrays.sort(arr);
//		
//		System.out.println("Minimum number in array is "+arr[0]);
//		System.out.println("Maximum number in array is "+arr[arr.length-1]);
//	}
	
	
	
	public static void main(String[] args) {
		int[] arr = {44,3,777,0,8999,66,99};

		 for (int i = 0; i < arr.length - 1; i++) {
			 for (int j = 0; j < arr.length - 1; j++) {
				 if(arr[j]>arr[j+1])
				 {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1]=temp;
				 }
				 
			 }
		 }
		 
		System.out.println(Arrays.toString(arr));
		System.out.println();
		System.out.println("Minimum number in array is "+arr[0]);
		System.out.println("Maximum number in array is "+arr[arr.length-1]);
	}
}
