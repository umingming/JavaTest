package com.test.question.calendar;

import java.util.Calendar;

public class Q02 {

	public static void main(String[] args) {
		/*
		오늘 태어난 아이의 백일과 첫돌이 언제인지 출력하시오.
		
		설계>
		1. Calendar
		2. set 날짜 + 100
		3. 백일 출력
		4. 날짜 초기화
		5. set 년도 + 1
		6. 첫돌 출력
		*/
		
		Calendar birth = Calendar.getInstance();
		birth.add(Calendar.DATE, 100);
		System.out.printf("백일 : %tF%n", birth);
		birth.add(Calendar.DATE, -100);
		
		birth.add(Calendar.YEAR, 1);
		System.out.printf("첫돌 : %tF%n", birth);
	}

}