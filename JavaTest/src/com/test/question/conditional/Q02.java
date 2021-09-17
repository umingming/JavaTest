package com.test.question.conditional;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q02 {

	public static void main(String[] args) throws Exception{
//		학생의 국어 점수를 입력받아 성적을 출력하시오.
		
//		설계>
//		1. BufferedReader
//		2. int로 점수를 입력 받음
//		3. if문 메소드 생성
//			> 0~100 인지 유효성 검사
//			> 점수에 따른 등급 출력
//		4. switch문 메소드 생성
//			>점수에 따른 등급 출력
			
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("점수 : ");
		int score = Integer.parseInt(reader.readLine());
		
		ifCase(score);
		switchCase(score);
	}//main

	private static void switchCase(int score) {
		switch(score / 10) {
		case 0, 1, 2, 3, 4, 5 :
			System.out.println("F");
		break;
		case 6 :
			System.out.println("D");
			break;
		case 7 :
			System.out.println("C");
			break;
		case 8 :
			System.out.println("B");
			break;
		case 9, 10 :
			System.out.println("A");
		break;
		}
	}//switchCase

	private static void ifCase(int score) {
		if(score>=0 && score<=100) {
			if (score >= 90) {
				System.out.println("A");
			} else if (score >= 80) {
				System.out.println("B");
			} else if (score >= 70) {
				System.out.println("C");
			} else if (score >= 60) {
				System.out.println("D");
			} else {
				System.out.println("F");
			}
		} else {
			System.out.println("점수가 유효하지 않습니다.");
		}
	}//ifCase

}
