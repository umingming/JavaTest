package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex18_Method {

	public static void main(String[] args) throws IOException {
//		System.out.println(m1(10));		//양수	->
//		String result1 = m1(10) ? "양수" : "양수아님";
//		System.out.println(result1);
//		m1(5);		//양수
//		m1(-10);	//양수 아님->
//		m1(-20);	//양수 아님
//	
//		int a = 10;
//		int b = 20;
//		int sum = 0;
//		sum = m2(a, b);
//		System.out.println(sum);
//		System.out.println(m2(5, 3));
		
		String name = m3("이름 입력");
		String age = m3("나이 입력");
		String address = m3("주소 입력");
		
		System.out.println("========");
		System.out.println("입력 결과");
		System.out.println("========");
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("주소: " + address);
		
	}
	public static boolean m1(int n) {
		n = n + 10;
		n *= 2;
		n -= 3;
//		String result = n > 0 ? "양수" : "양수 아님";
//		System.out.println(result);
		
		boolean result = n > 0 ? true : false;
		return result; //리턴문, 반환문
			
		
	}
	public static int m2(int a, int b) {
		return a + b;
	}
	public static String m3(String msg) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print(msg + ": "); //label
		String input = reader.readLine();
		return input;
		
	}

}
