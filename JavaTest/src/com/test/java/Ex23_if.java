package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex23_if {

	public static void main(String[] args) throws Exception{
		/*
		개발자> 조건을 제시한 후 결과에 따라 실행할 코드를 선택할 수 있게 하는 제어
		조건은 반드시 boolean으로 가지는 변수, ㅠㅛ현식
		if ( 조건식 ) { 실행문; }
		
		 */
		//m1();
		m3();
		
		

	}

	private static void m3() {
		//중첩된 제어문
		int kor = -13;
		
		if(kor >= 0 && kor <= 100) {
			
			if( kor >= 60) {
				System.out.println("합격");
			} else {
				System.out.println("불합격");
			}
			
		} else {
			System.out.println("점수가 올바르지 않습니다.");
		}
		
		
	}

	private static void m1() throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("숫자 입력 : ");
		int num = Integer.parseInt(reader.readLine());
		if (num > 0) {
			System.out.printf("입력한 숫자 %d는 양수입니다.%n", num);
		} else if (num < 0) { 
			System.out.printf("입력한 숫자 %d는 양수가 아닙니다.%n", num);
		} else {
			System.out.println("0입니다.");
		}
		
		System.out.println("프로그램을 종료합니다.");
		
		System.out.println("아침에 눈을 떴다.");
		System.out.println("지금 몇 시지?");
		int hour = Integer.parseInt(reader.readLine());
		
		if ( hour < 8) {
			System.out.println("아침밥을 먹는다.");
		} else {
			System.out.println("편의점에서 김밥을 산다.");
		}
		System.out.println("지하철을 타고 출근을 한다.");
		
	}//m1

}
