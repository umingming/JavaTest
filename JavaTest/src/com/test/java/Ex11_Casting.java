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
		
	}

}
