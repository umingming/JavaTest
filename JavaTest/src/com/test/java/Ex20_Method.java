package com.test.java;

public class Ex20_Method {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		swap(a, b);
		System.out.println(a);

		String s1 = "홍길동";
		String s2 = "아무개";
		swap(s1, s2);

		boolean b1 = true;
		boolean b2 = false;
		swap(b1, b2);
	}

	private static void swap(boolean s1, boolean s2) {
		System.out.printf("s1: %b, s2: %b%n", s1, s2);
		Boolean temp = s1;
		s1 = s2;
		s2 = temp;

		System.out.printf("s1: %b, s2: %b%n", s1, s2);

	}

	private static void swap(String s1, String s2) {
		System.out.printf("s1: %s, s2: %s%n", s1, s2);
		String temp = s1;
		s1 = s2;
		s2 = temp;

		System.out.printf("s1: %s, s2: %s%n", s1, s2);

	}

	private static void swap(int a, int b) {
		System.out.printf("a: %d, b: %d%n", a, b);
		int temp = a;
		a = b;
		b = temp;

		System.out.printf("a: %d, b: %d%n", a, b);
	}

}
