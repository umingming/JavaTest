package com.test.java;

public class Ex15_Method {

	public static void main(String[] args) {
		
		//제어 흐름
		System.out.println("하나");
		m1();
		System.out.println("둘");
		m2();
		System.out.println("셋");
		m3();
		m4();
		int num = 1;
		System.out.println(num);
		
		
	}

	private static void m4() {
		System.out.println("금붕어");
	}
	
	private static void m3() {
		System.out.println("거북이");
	}

	public static void m1() {
		System.out.println("강아지");
	}

	public static void m2() {
		System.out.println("고양이");
	}

}
