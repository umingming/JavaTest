package com.test.question.iteration;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q13T {

	public static void main(String[] args) throws Exception{
//		자판기 프로그램 구현
		
//		>설계
//		1. BufferedReader
//		2. for문 무한루프
//			>자판기 메뉴 출력
//			>투입 금액과 메뉴 int로 입력
//			>switch문 >메뉴선택에 따른 잔돈 출력
//			>엔터 입력 코드
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		menu();
		for(;;) {
			menu();
			
			System.out.println("--------------------");
			System.out.print("금액 투입(원)	: ");
			int amount = Integer.parseInt(reader.readLine());
			
			System.out.println("--------------------");
			System.out.print("음료 선택(번호)	: ");
			int choice = Integer.parseInt(reader.readLine());
			
			if(amount >= getItemPrice(choice)) {
			System.out.printf("+%s를 제공합니다.%n", getItemName(choice));
			System.out.printf("+잔돈 %,d원을 제공합니다.%n", amount - 700);
			} else {
				System.out.printf("+투입한 금액 %,d원은 %s 음료를 구입하기엔 잔액이 %,d원 부족합니다.%n", amount, getItemName(choice), getItemPrice(choice) - amount);
			}
			
			System.out.println("\n계속하시려면 엔터를 입력하세요.");
			reader.readLine();
		}
	}

	private static int getItemPrice(int choice) {
		if(choice == 1) {
			return 700;
		} else if (choice == 2) {
			return 600;
		} else if (choice == 3) {
			return 500;
		}
		return 0;
	}

	private static String getItemName(int choice) {
		if(choice == 1) {
			return "콜라";
		} else if (choice == 2) {
			return "사이다";
		} else if (choice == 3) {
			return "비타500";
		}
		return null;
	}

	private static void menu() {
		System.out.println("====================");
		System.out.println("       자판기");
		System.out.println("====================");
		System.out.println("1. 콜라	: 700원");
		System.out.println("2. 사이다	: 600원");
		System.out.println("3. 비타500	: 500원");
	}

}
