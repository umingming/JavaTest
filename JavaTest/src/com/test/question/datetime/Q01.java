package com.test.question.datetime;

import java.util.Calendar;

public class Q01 {

	public static void main(String[] args) {
//		아래의 코드를 참고해서 현재 시간을 출력하는 메소드 선언 후 호출하시오.
//		
//		설계> 
//		1. nowTime() 메소드 생성 > 현재 시각을 12시간 체계로 출력
//		2. 현재 시간 : 시 분 초 출력
//		3. nowTime_AMPM() 메소드 생성 > 현재 시각을 24시간 체계로 출력
//		4. 현재 시간 : 오전(오후) 시 분 초 출력
//		6. Calendar 와 int 두 경우 사용해보기
		
		nowTime();
		nowTime_AMPM();

	}

	private static void nowTime_AMPM() {
		Calendar now = Calendar.getInstance();
		System.out.printf("현재 시간: %s %d시 %d분 %d초%n"
				, now.get(Calendar.AM_PM) == 0 ? "오전" : "오후"
				, now.get(Calendar.HOUR_OF_DAY) >= 12 ? now.get(Calendar.HOUR_OF_DAY) - 12 : now.get(Calendar.HOUR_OF_DAY)
				, now.get(Calendar.MINUTE)
				, now.get(Calendar.SECOND));
	}

	private static void nowTime() {
		Calendar now = Calendar.getInstance();
		System.out.printf("현재 시간: %d시 %d분 %d초%n"
				, now.get(Calendar.HOUR)
				, now.get(Calendar.MINUTE)
				, now.get(Calendar.SECOND));
	}

}
