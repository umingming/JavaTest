package com.test.java;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex24_switch {

	public static void main(String[] args) throws Exception{

//		m1();
		m2();
	}//main

	private static void m2() throws Exception{
		
		//자판기
		//메뉴 출력 > 음료 선택 > 가격 출력
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("====================");
		System.out.println("       자판기");
		System.out.println("====================");
		System.out.println("1. 콜라");
		System.out.println("2. 사이다");
		System.out.println("3. 박카스");
		System.out.println("====================");
		System.out.print("선택(번호입력): ");
		
		String sel = reader.readLine();
		
		if (sel.equals("1")) {
			System.out.println("700원 입니다.");
		} else if (sel.equals("2")) {
			System.out.println("600원 입니다.");
		} else if (sel.equals("2")) {
			System.out.println("600원 입니다.");
		} else if (sel.equals("3")) {
		System.out.println("500원 입니다.");
		}
		
		System.out.println();
		
		switch(sel) {
			case "1" :
				System.out.println("700원 입니다.");
				break;
			case "2" :
				System.out.println("600원 입니다.");
				break;
			case "3" :
				System.out.println("500원 입니다.");
				break;
		}
		
		System.out.println("자판기 종료 ");
		
	}//m2

	private static void m1() {

		//숫자를 1개 입력 받아 한글로 출력하시오.
		int num = 10;
		if (num == 1) {
			System.out.println("하나");
		} else if (num == 2) {
			System.out.println("둘");
		} else if (num == 1) {
			System.out.println("셋");
		} else {
			System.out.println("나머지 숫자");
		}
		
		switch (num) {
			case 1 :
				System.out.println("하나");
				break;
			case 2 :
				System.out.println("둘");
				break;
			case 3 :
				System.out.println("셋");
				break;
			default:
				System.out.println("나머지 숫자");
				break;
		}
	}//m1

}
