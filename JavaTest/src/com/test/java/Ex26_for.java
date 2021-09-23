package com.test.java;

public class Ex26_for {

	public static void main(String[] args) {
		
//		m1();
//		for (int i=1; i<=10; i=i+1) {
//			System.out.println(i);
//		}
//		System.out.println();
//		for (int i=0; i<10; i=i+1) {
//			System.out.println(i+1);
//		}
		
		for (int i=1; i<=10; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
		for (int i=2; i<=10; i+=2) {
			System.out.println(i);
		}
	}

	private static void m1() {
		
		for(int i=0; i<5; i++) {
		System.out.println("안녕하세요.");
		}
	}

}
