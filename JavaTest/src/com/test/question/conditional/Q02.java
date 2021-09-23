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
		String grade = null;
		
		switchCase(score, grade);
		ifCase(score, grade);
	}//main

	private static void switchCase(int score, String grade) {
		switch(score / 10) {
		case 0 : case 1 : case 2 : case 3 : case 4 : case 5 :
			grade = "F";
			break;	
		case 6 :
			grade = "D";
			break;
		case 7 :
			grade = "C";
			break;
		case 8 :
			grade = "B";
			break;
		case 9 : case 10 :
			grade = "A";
			break;
		}
		System.out.printf("입력한 %d점은 성적 %s입니다.%n", score, grade);
	}//switchCase

	private static void ifCase(int score, String grade) {
		if(score>=0 && score<=100) {
			if (score >= 90) {
				grade = "A";
			} else if (score >= 80) {
				grade = "B";
			} else if (score >= 70) {
				grade = "C";
			} else if (score >= 60) {
				grade = "D";
			} else {
				grade = "F";
			}
		} else {
			grade = "점수가 유효하지 않습니다";
		}
		System.out.printf("입력한 %d점은 성적 %s입니다.%n", score, grade);
	}//ifCase

}
