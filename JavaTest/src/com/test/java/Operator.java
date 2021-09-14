package com.test.java;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Operator {

	public static void main(String[] args) throws Exception{
		//throws Exception = throws IoException
//		int a = 10;
//		int b = 3;
//		System.out.printf("%d + %d = %d%n", a, b, a + b);
//		System.out.printf("%d - %d = %d%n", a, b, a - b);
//		System.out.printf("%d * %d = %d%n", a, b, a * b);
//		System.out.printf("%d / %d = %d%n", a, b, a / b);
//		System.out.printf("%d %% %d = %d%n", a, b, a % b);
//		System.out.println("10 % 3 = " + 10 % 3);
//		System.out.println(10.0/3);
//		
//		//모든 산술 연산자의 결과 자료형은 두 피연산자 중에서 크기가 더 큰 자료형으로 됨.
//		int c = 1000000000;
//		int e = 2000000000;
//		System.out.println(c + e);
//		System.out.println( c+ (long)e);
//
//		System.out.println();
//		System.out.println();
//		System.out.println();
//		
//		a = 10;
//		b = 3;System.out.printf("%d > %d = %b%n", a, b, a > b); //10 > 3 = true
//		System.out.printf("%d >= %d = %b%n", a, b, a >= b); //10 - 3 = 7
//		System.out.printf("%d < %d = %b%n", a, b, a < b); //10 * 3 = 30
//		System.out.printf("%d <= %d = %b%n", a, b, a <= b); //10 / 3 = 3
//		System.out.printf("%d == %d = %b%n", a, b, a == b); //10 % 3 = 1
//		System.out.printf("%d != %d = %b%n", a, b, a != b); //10 % 3 = 1
//		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("영소문자 입력: ");
		String input = reader.readLine();
		System.out.println("입력된 문자: " + input);
		char c = input.charAt(0); //input인 문자열을 char로 변환.
		System.out.println(c);
		System.out.println((int)c);
		System.out.println((int)c >= 97);
		System.out.println((int)c <= 122);

		System.out.println((int)c >= (int)'a');
		System.out.println((int)c <= (int)'z');

		System.out.println(c >= (int)'a');
		System.out.println(c <= (int)'z');
		
		
		//사용자가 입력한 문자 1개가 영어 소문자인지 확인하려면 문자코드값을 사용함.
	}

}
