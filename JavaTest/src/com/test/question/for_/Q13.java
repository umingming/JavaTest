package com.test.question.for_;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q13 {

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
		
		for(;;) {
			System.out.println("====================");
			System.out.println("       자판기");
			System.out.println("====================");
			System.out.println("1. 콜라		: 700원");
			System.out.println("2. 사이다		: 600원");
			System.out.println("3. 비타500	: 500원");
			System.out.println("--------------------");
			System.out.print("금액 투입(원)	: ");
			int amount = Integer.parseInt(reader.readLine());
			System.out.println("--------------------");
			System.out.print("음료 선택(번호)	: ");
			int choice = Integer.parseInt(reader.readLine());
			
			switch(choice) {
			case 1 :
				System.out.println("+콜라를 제공합니다.");
				System.out.printf("+잔돈 %,d원을 제공합니다.%n", amount - 700);
				break;
			case 2 :
				System.out.println("+사이다를 제공합니다.");
				System.out.printf("+잔돈 %,d원을 제공합니다.%n", amount - 600);
				break;
			case 3 :
				System.out.println("+비타500을 제공합니다.");
				System.out.printf("+잔돈 %,d원을 제공합니다.%n", amount - 500);
				break;
			default :
				System.out.println("판매 불가능합니다.");
				System.out.printf("+잔돈 %,d원을 제공합니다.", amount);
				break;
			}
			
			System.out.println("\n계속하시려면 엔터를 입력하세요.");
			String enter = reader.readLine();
		}
	}

}
