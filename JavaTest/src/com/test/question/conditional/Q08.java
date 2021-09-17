package com.test.question.conditional;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q08 {

	public static void main(String[] args) throws Exception{
//		주차 요금을 계산하시오.
		
//		설계> 
//		1. time 메소드 생성
//			> BufferedReader
//			> int로 시간 입력 받기
//			> 총 몇 분인지 계산해서 리턴
//		3. 시간의 차가 몇 분인지 구함
//		4. if문
//			> 시간의 차가 30분 이내 > 무료 출력
//			> 시간의 차가 30분 초과 > 10분 마다 2000원 부과하는 멘트 출력
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int in = time("들어온 시간");
		int out = time("나간 시간");
		int difference = out - in;
		
		if (difference >= 0 && difference <= 30) {
			System.out.println("주차 요금은 무료 입니다.");
		} else if (difference > 30){
			System.out.printf("주차 요금은 %,d원 입니다."
					, ( ( difference - 30 ) / 10 + 1) * 2000);
		} else {
			System.out.println("시간을 다시 입력해주세요.");
		}
	}//main

	private static int time(String time) throws Exception{

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.printf("[%s]%n", time);
		System.out.print("시 : ");
		int hour = Integer.parseInt(reader.readLine());
		System.out.print("분 : ");
		int min = Integer.parseInt(reader.readLine());
		
		int total = hour * 60 + min;
		return total;
	}//time
}
