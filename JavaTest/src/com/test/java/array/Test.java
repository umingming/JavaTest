package com.test.java.array;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
//		Runtime.getRuntime().gc();
//		int[] arr = new int[5];
		ArrayList<Integer> num = new ArrayList<Integer>(10000000);
//		int[] num = new int[10000000];
//		for(int temp : num) {
//		   System.out.println();
//		}
		long usedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		System.out.print(usedMemory + " bytes");
	}
}
