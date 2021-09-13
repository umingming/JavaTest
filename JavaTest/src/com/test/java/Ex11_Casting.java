package com.test.java;

public class Ex11_Casting {

	public static void main(String[] args) {
		
		byte b1 = 10;
		short s1;
		
		s1 = b1;
		s1 = (short)b1; //우측의 변수나 상수의 자료형을 괄호 안 자료형으로 변환시키는 작업
		System.out.println("s1: " + s1);
		
		short s2 = 1000;
		byte b2;
		b2 = (byte)s2;
		
		System.out.println("b2: " + b2);
		
		byte m1 = 10;
		short m2 = 10;
		int m3 = 10;
		long m4 = 10;
		
		int n1 = 1000;
		float k1;
		k1 = n1;

		System.out.println("k1: " + k1);
		int n2;
		float k2 = 1000;
		n2 = (int) k2;
		System.out.println("k2: " + k2);
		
		
		
		
		
	}

}
