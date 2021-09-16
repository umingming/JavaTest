package com.test.question.datetime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Q04 {

	public static void main(String[] args) throws Exception {
//		커플의 이름과 만난 날을 입력 받아 기념 출력
		
//		설계>
//		1. name 메소드 생성
//			> BufferedReader
//			> 이름을 입력 받아 리턴해줌
//		2. first 메소드 생성
//			> BufferedReader
//			> int로 년, 월, 일을 입력받고 리턴
//		3. anniversary 메소드 생성  
//		   > 입력 값으로 시각을 수정 
//	 	   > add로 day만큼 더하고 day일 :  출력
//		4. 변수의 값으로 name(남자, 여자) 메소드 호출
//		5. 변수의 값으로 first(년, 월, 일) 메소드 호출
//		6. anniversary(0, 100, 200, 300, 500, 1000)으로 호출
		
		String man = name("남자");
		String woman = name("여자");
		int year = first("년");
		int month = first("월")-1;
		int date = first("일");
		
		System.out.printf("'%s'과(와) '%s'의 기념일%n", man, woman);
		anniversary(year, month, date, 100);
		anniversary(year, month, date, 200);
		anniversary(year, month, date, 300);
		anniversary(year, month, date, 500);
		anniversary(year, month, date, 1000);
		
	}

	private static int first(String input) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.printf("만난 날(%s) : ", input);
		int date = Integer.parseInt(reader.readLine());
		return date;
	}

	private static String name(String input) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.printf("%s 이름 : ", input);
		String name = reader.readLine();
		return name;
	}

	private static void anniversary(int year, int month, int date, int day) {
		Calendar first = Calendar.getInstance();
		first.set(year, month, date);
		first.add(Calendar.DATE, day);
		System.out.printf("%d일 : %tF%n", day, first);
	}
	
}
