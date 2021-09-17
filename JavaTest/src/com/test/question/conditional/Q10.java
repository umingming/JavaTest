package com.test.question.conditional;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Q10 {

	public static void main(String[] args) throws Exception{
//		날짜를 입력받아 아래의 조건에 맞게 결과를 출력하시오.
		
//		설계>
//		1. date 메소드 생성
//			> BufferedReader
//			> int로 입력 받고 리턴
//		2. int 변수의 값으로 date(년, 월, 일) 호출 
//		3. Calendar 이용해 날짜로 수정하기
//		4. DAY_OF_WEEK로 몇 번째 요일인지 구하기
//		5. if문과 switch문 메소드 생성
//			> 0 or 7 > 휴일
//			> 그 외 > 토요일로 날짜 변경 후 출력
		
		int year = date("년");
		int month = date("월") - 1;
		int date = date("일");
		
		Calendar cal = Calendar.getInstance();
		cal.set(year, month, date);
		
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		
		ifCase(year, month, date, dayOfWeek);
		switchCase(year, month, date, dayOfWeek);
	}//main

	private static void switchCase(int year, int month, int date, int dayOfWeek) throws Exception {
		switch(dayOfWeek) {
		case 0, 7 :
			System.out.println("입력하신 날짜는 '휴일'입니다.");
			System.out.println("결과가 없습니다.");
			break;
		case 1, 2, 3, 4, 5, 6 :
			Calendar cal = Calendar.getInstance();
			cal.set(year, month, date);
			cal.set(Calendar.DAY_OF_WEEK, 7);
			System.out.println("입력하신 날짜는 '평일'입니다.");
			System.out.println("해당 주의 토요일로 이동합니다.");
			System.out.printf("이동한 날짜는 '%tF'입니다. %n", cal);
			break;
		}
	}//switchCase

	private static void ifCase(int year, int month, int date, int dayOfWeek) throws Exception {
		if(dayOfWeek == 0 || dayOfWeek == 7) {
			System.out.println("입력하신 날짜는 '휴일'입니다.");
			System.out.println("결과가 없습니다.");
			
		} else {
			Calendar cal = Calendar.getInstance();
			cal.set(year, month, date);
			cal.set(Calendar.DAY_OF_WEEK, 7);
			System.out.println("입력하신 날짜는 '평일'입니다.");
			System.out.println("해당 주의 토요일로 이동합니다.");
			System.out.printf("이동한 날짜는 '%tF'입니다. %n", cal);
		}
	}//caseIf

	private static int date(String date) throws Exception{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.printf("%s : ", date);
		return Integer.parseInt(reader.readLine());
	}//date
}
