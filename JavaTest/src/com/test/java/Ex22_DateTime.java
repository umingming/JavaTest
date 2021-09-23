package com.test.java;

import java.util.Calendar;
import java.util.Date;


public class Ex22_DateTime {

	public static void main(String[] args) {
		//날짜와 시간 자료형
		//m1();
		//m2();
		//m3();
		//m4();
		//m5();
		m6();

	}

	private static void m6() {
		//2시간 30분 + 10분 = 2시간 40분
		
		int hour = 3;
		int min = 30;
		
		min -= 120;
		
		hour = hour + (min / 60);
		min  = min >= 0 ? (min % 60) : -(min % 60);
		System.out.printf("%d시간 %d분%n", hour, min);
		
		System.out.println(System.currentTimeMillis());
		
		
	}

	private static void m5() {
		Calendar now = Calendar.getInstance();
		Calendar birthday = Calendar.getInstance();
		birthday.set(1995, 1, 12, 13, 30, 25);
		
		//now - birthday?
		//tict 값
		System.out.println(birthday.getTimeInMillis());
		long birthdayTick = birthday.getTimeInMillis();
		long nowTick = now.getTimeInMillis();
		
		System.out.println((nowTick - birthdayTick) / 1000 / 60 / 60/ 24);
		
		Calendar christmas = Calendar.getInstance();
		christmas.set(2021, 11, 25);
		long christamsTick = christmas.getTimeInMillis();
		
		System.out.println((christamsTick - nowTick) / 1000 / 60 / 60 / 24);
		
		now.set(2021, 8, 8);
		nowTick = now.getTimeInMillis();
		
		Calendar endDate = Calendar.getInstance();
		endDate.set(2022, 1, 24);
		long endDateTick  =endDate.getTimeInMillis();
		
		System.out.println((endDateTick - nowTick) / 1000 / 60 / 60 / 24);
		
	}

	private static void m4() {
		Calendar now = Calendar.getInstance();
		System.out.printf("1일차: %tF%n", now);
		
		now.add(Calendar.DATE, 100);
		System.out.printf("100일차: %tF%n", now);
		
		now.set(2021, 8, 16);
		System.out.printf("초기화: %tF%n", now);
		
		now.add(Calendar.YEAR, 1);
		System.out.printf("1년 뒤: %tF%n", now);
		
		now.set(2021, 8, 16);
		System.out.printf("초기화: %tF %tT%n", now, now);
		
		now.add(Calendar.HOUR, 5);
		now.add(Calendar.MINUTE, 25);
		System.out.printf("5시간 25분 뒤: %tT%n", now);

		now.set(2021, 8, 16);
		System.out.printf("초기화: %tF %tT%n", now, now);
		
		//100개월 전
		now.add(Calendar.MONTH, -100);
		System.out.printf("100개월 전: %tF%n", now);
		
		now.set(2021, 8, 8);
		System.out.printf("개강일: %tF%n", now);
		now.add(Calendar.DATE, 112);
		System.out.printf("100개월 전: %tF%n", now);
		
	}

	private static void m3() {
		//특정 시각 얻어오기
		//내 생일
		Calendar birthday = Calendar.getInstance();
		birthday.set(1995, 0, 12, 18, 12, 25);
//		birthday.set(Calendar.MONTH, 0);
//		birthday.set(Calendar.DATE, 12);
//		birthday.set(Calendar.HOUR, 18);
//		birthday.set(Calendar.MINUTE, 12);
//		birthday.set(Calendar.SECOND, 25);
		
		System.out.printf("%tF %tT%n", birthday, birthday);
		
	}

	private static void m2() {
		Calendar c1 = Calendar.getInstance();
		System.err.println(c1.get(1));
		System.err.println(c1.get(2));
		System.err.println(c1.get(3));
		System.err.println(c1.get(4));
		System.err.println(c1.get(5));
		System.err.println(c1.get(6));
		int year = 1;
		System.out.println(Calendar.YEAR);
		System.out.println("====");
		System.out.println(c1.get(Calendar.YEAR));
		System.out.println(c1.get(Calendar.MONTH));
		System.out.println(c1.get(Calendar.DATE));
		System.out.println(c1.get(Calendar.HOUR));
		System.out.println(c1.get(Calendar.MINUTE));
		System.out.println(c1.get(Calendar.SECOND));
		System.out.println(c1.get(Calendar.MILLISECOND));
		System.out.println(c1.get(Calendar.AM_PM));
		System.out.println(c1.get(Calendar.DAY_OF_MONTH));
		System.out.println(c1.get(Calendar.DAY_OF_WEEK));
		System.out.println(c1.get(Calendar.DAY_OF_YEAR));
		System.out.println(c1.get(Calendar.WEEK_OF_MONTH));
		System.out.println(c1.get(Calendar.WEEK_OF_YEAR));
		System.out.println(c1.get(Calendar.HOUR_OF_DAY));
		
		System.out.printf("오늘은 '%d년 %d월 %d일 %d %d시 %d분 %d초 입니다.%n"
				, c1.get(Calendar.YEAR), c1.get(Calendar.MONTH), c1.get(Calendar.DATE), c1.get(Calendar.AM_PM), c1.get(Calendar.HOUR), c1.get(Calendar.MINUTE),c1.get(Calendar.SECOND) );
		System.out.printf("오늘은 '%d년 %d월 %d일 %s %d시 %d분 %d초 입니다.%n"
				, c1.get(Calendar.YEAR)
				, c1.get(Calendar.MONTH) + 1
				, c1.get(Calendar.DATE)
				, c1.get(Calendar.AM_PM) == 0 ? "오전" : "오후"
				, c1.get(Calendar.HOUR)
				, c1.get(Calendar.MINUTE)
				, c1.get(Calendar.SECOND) );
		System.out.printf("%tF%n", c1);
		System.out.printf("%tT%n", c1);
		System.out.printf("%tA%n", c1);
		System.out.printf("%d-%02d-%02d%n"
				, c1.get(Calendar.YEAR)
				, c1.get(Calendar.MONTH) + 1
				, c1.get(Calendar.DATE));
		
	}

	private static void m1() {
		Date date = new Date();
		
		System.out.println(date);
		
	}

}
