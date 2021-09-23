package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Ex25_LocalVariable {

	public static void main(String[] args) throws IOException {
//		int c = 100;
//
//		System.out.println("c: " + c); 
//		m1();
//		System.out.println("c: " + c); 
//		
//		if(c > 0) {
//			int d = 1000;
//			System.out.println("d: " + d);
//		}
		//int i:for문 동안 계쏙
		//int n:한 바퀴 동안만 살아있음.
//		for(int i=1; i<=10; i++) {
//			int n = 10;
//			System.out.println(n);
//			n++;
//		}
//		m6();
//		m7();
//		m8();
		m9();
		
		
	}//main

	private static void m9() throws NumberFormatException, IOException {
//		for(int i=Integer.MIN_VALUE + 100; i<10; i--) {
//			System.out.println(i);
//		}
//		for(int i=0; ; i++) {
//			System.out.println(i);
//		}
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0;
		for(;;) {
			System.out.println("숫자(종료 0 입력): ");
			int num = Integer.parseInt(reader.readLine());
			
			if(num == 0) {
				break;
			}
			sum += num;
		}
		System.out.println(sum);
		
	}

	private static void m8() {
		// TODO Auto-generated method stub
		//q
		for(int i=1; i<=6; i++) {
//			break;
			if(i==5) {
				continue;
			}
			System.out.println(i);
		}
		
	}

	private static void m7() {
		for(int i=0; i<3; i++)  {
			int num = (int)(Math.random() * 7) + 1;
			System.out.println(num);
		}
		
	}

	private static void m6() throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0;
		for (int i=0; i<10; i++) {
			System.out.println("숫자: ");
			int num = Integer.parseInt(reader.readLine());
			sum += num;
		}
		System.out.println(sum);
	}

	private static void m1() {
		int c = 200;
		System.out.println("m1, c: " + c); 
		
	}

}
