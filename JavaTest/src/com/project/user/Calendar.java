package com.project.user;

public class Calendar {

	public static void main(String[] args) {
		/*
		달력 만들기
		-이번 달의 마지막 일
		-이번 달 1일의 요일

		설계>
		1. 년도, 월 변수 선언
		2. 마지막 일 구하는 메소드 생성
			>switch문으로 return함
		3. 1일이 무슨 요일인지 구하는 메소드 생성
			>date = 1 변수 선언
			>서기 1.1.1부터 지난 달 까지 며칠인지 구하기
				>for문 + switch문
			>switch문으로 해당 요일 리턴 일~토: 0~6
		4. for문 한 달 반복
			>요일만큼 tap
			>7로 나눠서 개행 문자 출력
		*/

		int year = 2021;
		int month = 11;
		
		int dayOfWeek = getDayOfWeek(year, month);
		int lastDay = getLastDay(year, month);
		
//		System.out.printf("\t\t\t%d년 %d월%n", year, month);
		System.out.println("|일\t|월\t|화\t|수\t|목\t|금\t|토");
		
		for(int i=0; i<dayOfWeek; i++){
			System.out.print("\t");
		}
		
		for(int i=1; i<=lastDay; i++) {
			if(i>=5&&i<=15) {
				System.out.printf(" %s/%2d\t", month, i);
			} else {
				System.out.print("\t");
			}
			if((i + dayOfWeek) % 7 == 0) {
				System.out.println();
			}
		}
		System.out.println("\n예매");
	}

	private static int getDayOfWeek(int year, int month) {
		int day = 0;
		for(int i=1; i<year; i++) {
			day += isLeapYear(i) ? 366 : 365;
		}
		
		for(int i=1; i<month; i++) {
			day += getLastDay(year, i);
		}
		
		day++;
		
		return day % 7;
	}//dayOfWeek

	private static int getLastDay(int year, int month) {
		switch (month) {
		case 1, 3, 5, 7, 8, 10, 12 :
			return 31;
		case 4, 6, 9, 11 :
			return 30;
		case 2 : 
			return isLeapYear(year) ? 29 : 28;
		}
		return 0;
	}//lastDay

	private static boolean isLeapYear(int year) {
		
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			return true;
		} else {
			return false;
		}
	}//isLeapYear

}
