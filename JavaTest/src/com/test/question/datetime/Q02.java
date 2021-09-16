package com.test.question.datetime;

import java.util.Calendar;

public class Q02 {

	public static void main(String[] args) {
//		오늘 태어난 아이의 백일과 첫돌이 언제인지 출력하시오.
		
//		설계>
//		1. Calendar.getInstance()로 현재시각 얻기
//		2. add로 100일 더하기
//		3. 백일 : 0000-00-00 출력
//		4. 현재 시각 초기화
//		5. add로 1년 더하기
//		6. 첫돌 : 0000-00-00 출력
		
		Calendar birthday = Calendar.getInstance();
		
		birthday.add(Calendar.DATE, 100);
		System.out.printf("백일 : %tF%n", birthday);
		birthday.add(Calendar.DATE, -100);
		
		birthday.add(Calendar.YEAR, 1);
		System.out.printf("첫돌 : %tF%n", birthday);
	}

}
