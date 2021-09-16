package com.test.question.datetime;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Q04 {

	public static void main(String[] args) throws Exception {
//		커플의 이름과 만난 날을 입력 받아 기념 출력
		
//		설계>
//		1. BufferedReader
//		2. 남자(여자) 이름 : 출력하고 각 입력
//		3. 만난날(년, 월, 일) : 출력하고 각 입력 
//		4. 만난날 int로 변환
//		5. anniversary 메소드 생성  
//		   > 입력 값으로 시각을 수정 
//	 	   > add로 day만큼 더하고 day일 :  출력
//		6. anniversary(0, 100, 200, 300, 500, 1000)으로 호출
	
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.printf("남자 이름 : ");
		String man = reader.readLine();
		System.out.printf("여자 이름 : ");
		String woman = reader.readLine();
		System.out.printf("만난날(년) : ");
		String inputYear = reader.readLine();
		System.out.printf("만난날(월) : ");
		String inputMonth = reader.readLine();
		System.out.printf("만난날(일) : ");
		String inputDate = reader.readLine();
		
		int year = Integer.parseInt(inputYear);
		int month = Integer.parseInt(inputMonth)-1;
		int date = Integer.parseInt(inputDate);
		
		System.out.printf("'%s'과(와) '%s'의 기념일%n", man, woman);
		anniversary(year, month, date, 100);
		anniversary(year, month, date, 200);
		anniversary(year, month, date, 300);
		anniversary(year, month, date, 500);
		anniversary(year, month, date, 1000);
		
	}

	private static void anniversary(int year, int month, int date, int day) {
		Calendar first = Calendar.getInstance();
		first.set(year, month, date);
		first.add(Calendar.DATE, day);
		System.out.printf("%d일 : %tF%n", day, first);
	}
	
}
