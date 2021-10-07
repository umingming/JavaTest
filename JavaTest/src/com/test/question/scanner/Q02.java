package com.test.question.scanner;

import java.util.Scanner;

public class Q02 {
	/*
	토큰을 입력 받아 각각의 개수를 출력하시오.
	
	설계>
	1. 카운트, input 정적 변수 선언
	2. 메인 메소드
		>Scanner
		>nextLine으로 입력값 input에 저장
		>확인, 결과 메소드호출
	3. 체크 메소드
		>input.split으로 String 배열 생성해 요소에 값 저장
		>for문 배열 길이 반복
			>매개값이 배열의 요소인 카운트 메소드 호출
	4. 카운트 메소드(매개변수 String)
		>boolean 변수 선언후 true로 초기화
		>for문 string의 길이 반복
			>c 변수 선언 후 String의 i번째 글자로 초기화
			>if문 c가 숫자/문자가 아닌지? 논리 변수 false로 저장
				>문자확인할 때 온점도 포함
		>if 숫자/문자? 해당 카운트++
	5. 결과 메소드; printf로 정적 변수 출력
	 */
	
	private static String input;
	private static int numCount;
	private static int strCount;
	private static int mixCount;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("입력: ");
		input = scan.nextLine();
		
		check();
		result();

	}//main

	private static void check() {
		String[] str = input.split(" ");
		
		for(int i=0; i<str.length; i++) {
			count(str[i]);
		}
	}//check

	private static void count(String str) {
		boolean isNum = true;
		boolean isStr = true;
		
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			
			if(c < '0' || c > '9') {
				isNum = false;
			} else if(c < '가' || c > '힣' || c != '.' ) {
				isStr = false;
			}
		}
		
		if(isNum) {
			numCount++;
		} else if(isStr) {
			strCount++;
		} else {
			mixCount++;
		}
	}//카운트
	
	private static void result() {
		System.out.println("[결과]");
		System.out.printf("숫자 : %d개%n", numCount);
		System.out.printf("문자 : %d개%n", strCount);
		System.out.printf("혼합 : %d개%n", mixCount);
	}//결과
}
