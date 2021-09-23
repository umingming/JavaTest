package com.test.java;

public class Ex25_LocalVariable {

	public static void main(String[] args) {
		int c = 100;

		System.out.println("c: " + c); 
		m1();
		System.out.println("c: " + c); 
		
		if(c > 0) {
			int d = 1000;
			System.out.println("d: " + d);
		}
	}

	private static void m1() {
		int c = 200;
		System.out.println("m1, c: " + c); 
		
	}

}
