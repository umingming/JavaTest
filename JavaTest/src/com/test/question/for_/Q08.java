package com.test.question.for_;

public class Q08 {

	public static void main(String[] args) {
//		서기 1년 1월 1일부터 오늘까지 며칠째인지 합을 구하시오.
		
//		설계>
//		1. date, year, month, day 변수 선언 후 초기화
//		2. 윤년 메소드 생성
//			>윤년 : year % 4 == 0 && year % 100 != 0 
//				   year % 400 == 0
//		3. for문
//			>year은 1부터 현재 년도까지
//			>if문
//				>i가 평년이면 date + 365;
//				>i가 윤년이면 date + 366;
//		4. for문
//			>month는 1부터 현재 달까지
//			>switch문
//				>i가 1, 3, 5, 7, 8, 10, 12면 date + 31
//				>i가 4, 6, 9, 11이면 date + 30
//				>i가 2면 if문
//					>평년이면 + 28, 윤년이면 + 29
//		5. date에 day 더하기
//		6. 오늘이 무슨 요일인지 switch문 메소드 생성(date % 7)
//			>0~6: 일~토
//		7. 결과 출력
		
		int year = 2021;
		int month = 9;
		int date = 23;
		int day = 0;
		
		for(int i=1; i<year; i++) {
			if (leapYear(i).equals("윤년")) {
				day += 366;
			} else {
	 		day += 365;
			}
		}
		
		for(int i=1; i<month; i++) {
			switch(i){
				case 1, 3, 5, 7, 8, 10, 12 : 
					day += 31;
					break;
				case 4, 6, 9, 11 : 
					day += 30;
					break;
				case 2 :
					if (leapYear(year).equals("윤년")) {
						day += 29;
					} else {
						day += 28;
					}
					break;
			}
		}
		
		day += date;
		System.out.printf("2021년 9월 23일은 %,d일째 되는 날입니다.%n", day);
		System.out.printf("2021년 9월 23일은 %s요일입니다.%n", dayOfWeek(day));
	}//main

	private static String dayOfWeek(int day) {
		String dayOfWeek = "";
		switch(day % 7) {
		case 0 : dayOfWeek = "일"; break;
		case 1 : dayOfWeek = "월"; break;
		case 2 : dayOfWeek = "화"; break;
		case 3 : dayOfWeek = "수"; break;
		case 4 : dayOfWeek = "목"; break;
		case 5 : dayOfWeek = "금"; break;
		case 6 : dayOfWeek = "토"; break;
		}
		return dayOfWeek;
	}//dayOfWeek

	private static String leapYear(int year) {
		String leapYear = "";
		
		if (year % 4 == 0) {
			if (year % 100 == 0 ) {
				if (year % 400 == 0) {
					leapYear = "윤년";
				}
			} else {
				leapYear = "윤년";
			}
		}
		return leapYear;
	}//leapYear
}
