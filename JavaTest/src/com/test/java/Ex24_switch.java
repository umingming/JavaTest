package com.test.java;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex24_switch {

	public static void main(String[] args) throws Exception{

//		m1();
//		m2();
		m3();
		
		
	}//main

	private static void m3() {

		//사용자가 월을 입력하면 해당월의 마지막 일이 언제인지?
		int month = 11;
		int lastDay ;

		switch (month) {
		case 1 :
		case 3 :
		case 5 :
		case 7 :
		case 8 :
		case 10 :
		case 12 :
			lastDay = 31;
			break;
		case 2 :
			lastDay = 28;
			break;
		case 4 :
		case 6 :
		case 9 :
		case 11 :
			lastDay = 30;
		}//switch
		
		System.out.printf("입력한 %d월의 마지막 날짜는 %d일입니다.", month, lastDay);
		
		
	}//m3

	private static void m2() throws Exception{
		
		//자판기
		//메뉴 출력 > 음료 선택 > 가격 출력
		
		//사이다 가격 700원 이상, 콜라와 항상 동일한 가격으로
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
		
		if (sel.equals("1")||sel.equals("2")) {
			System.out.println("700원 입니다.");
		} else if (sel.equals("3")) {
		System.out.println("500원 입니다.");
		}
		
		System.out.println();
		
		switch(sel) {
			case "1" :
//				System.out.println("700원 입니다.");
//				break;
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
