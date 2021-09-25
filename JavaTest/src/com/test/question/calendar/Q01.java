package com.test.question.calendar;

import java.util.Calendar;

public class Q01 {

	public static void main(String[] args) {
		/*
		현재 시간을 출력하는 메소드 선언하고 호출하시오.
		
		설계>
		1. nowTime() 메소드 생성
			>Calendar
			>현재 시간 출력
		2. nowTime_AMPM() 메소드 생성
			>Calendar
			>현재 시간을 오전/ 오후로 출력
		*/
		
		nowTime();
		nowTime_AMPM();
	}

	private static void nowTime_AMPM() {
		Calendar now = Calendar.getInstance();
		
		System.out.printf("현재 시간 : %s %d시 %d분 %d초%n" 
				, now.get(Calendar.AM_PM) == 0 ? "오전" : "오후" 
				, now.get(Calendar.HOUR)
				, now.get(Calendar.MINUTE)
				, now.get(Calendar.SECOND));
	}

	private static void nowTime() {
		Calendar now = Calendar.getInstance();
		
		System.out.printf("현재 시간 : %d시 %d분 %d초%n" 
					, now.get(Calendar.HOUR_OF_DAY)
					, now.get(Calendar.MINUTE)
					, now.get(Calendar.SECOND));
	}

}
