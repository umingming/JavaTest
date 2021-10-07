package com.test.question.scanner;

import java.util.Scanner;

public class Q01 {
	/*
		숫자를 입력 받아 양수, 음수의 개수를 출력하시오.
		-숫자가 5개 입력되지 않았을 경우 안내 멘트 출력.
		
		설계>
		1. 카운트, input, String 배열 정적 변수 선언
		2. 메인 메소드
			>Scanner으로 숫자 입력 받음
			>확인, 결과 메소드
		3. 카운트 메소드
			>input.split 이용해 배열 생성 후 요소에 값 저장
			>for문으로 배열 길이 반복
				>요소를 int로 형변환해 변수에 저장
				>if문 양수/음수? 카운트++
		4. 확인 메소드
			>if문 길이가 5인지? 아니면 안내 멘트 출력
		5. 결과 메소드
			>printf로 카운트 정적변수 출력
	 */
	
	private static int positive;
	private static int negative;
	private static int zero;
	private static String input;
	private static String[] nums;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("입력: ");
		input = scan.nextLine();
		
		count();
		result();
		check();

	}//main

	private static void count() {
		nums = input.split(" ");
		
		for(int i=0; i<nums.length; i++) {
			int n = Integer.parseInt(nums[i]);
			
			if(n > 0) {
				positive++;
			} else if(n < 0) {
				negative++;
			} else {
				zero++;
			}
		}
	}//카운트

	private static void result(){
		System.out.println("[결과]");
		System.out.printf("양수: %d개%n", positive);
		System.out.printf("음수: %d개%n", negative);
		System.out.printf("0: %d개%n", zero);
	}//결과 출력
	
	private static void check() {
		if(nums.length < 5) {
			System.out.printf("숫자가 %d개 부족합니다.%n", 5-nums.length);
		}else if(nums.length > 5) {
			System.out.printf("숫자가 %d개 많습니다.%n", nums.length-5);
		}
	}//체크
}
