package com.test.java;

public class Ex17_Method {

	public static void main(String[] args) {
		
		m1("홍길동");
		m1("아무개");
		m3(10,3);
		
	}
	public static void m1(String name) {
		System.out.println(name + " 안녕~");		
	}
	public static void m2(int num) {
		System.out.println(num > 0 ? "양수" : "양수 아님");
		
	}
	public static void m3(int a, int b) {
		System.out.printf("%,d + %,d = %,d%n", a, b, a + b);
		System.out.printf("%,d - %,d = %,d%n", a, b, a - b);
		System.out.printf("%,d * %,d = %,d%n", a, b, a * b);
		System.out.printf("%,d / %,d = %,.1f%n", a, b, (double)a / b);
		System.out.printf("%,d %% %,d = %,d%n", a, b, a % b);
		
	}
}
