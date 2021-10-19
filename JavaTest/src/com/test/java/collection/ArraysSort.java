package com.test.java.collection;

import java.util.Arrays;

public class ArraysSort {

	public static void main(String[] args) {
		int[] arr1 = {0, 1, 2, 3, 4};
		int[] arr2 = Arrays.copyOf(arr1, arr1.length);
		int[] arr3 = Arrays.copyOf(arr1, 3);
		int[] arr4 = Arrays.copyOf(arr1, 7);
		int[] arr5 = Arrays.copyOfRange(arr1, 2, 4);
		int[] arr6 = Arrays.copyOfRange(arr1, 0, 7);

//		System.out.println(Arrays.toString(arr2));
//		System.out.println(Arrays.toString(arr3));
//		System.out.println(Arrays.toString(arr4));
//		System.out.println(Arrays.toString(arr5));
//		System.out.println(Arrays.toString(arr6));
		
		int[] arr = new int[5];
//		Arrays.fill(arr, 9);
		Arrays.setAll(arr, i -> (int)(Math.random()*5)+1);
		System.out.println(Arrays.toString(arr));
	}

}
