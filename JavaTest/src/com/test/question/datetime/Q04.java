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
//		5. 입력 받은 시각 Calendar로 수정하기 
//		6. add 메소드로 100, 200, 300, 500, 1000 각각 더하고 출력(매번 초기화)
	
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
		String inputDay = reader.readLine();
		
		int year = Integer.parseInt(inputYear);
		int month = Integer.parseInt(inputMonth)-1;
		int day = Integer.parseInt(inputDay);
		
		Calendar first = Calendar.getInstance();
		first.set(year, month, day);
		
		System.out.printf("'%s'과(와) '%s'의 기념일%n", man, woman);
		first.add(Calendar.DATE, 100);
		System.out.printf("100일 : %tF%n", first);
		first.set(year, month, day);
		
		first.add(Calendar.DATE, 200);
		System.out.printf("200일 : %tF%n", first);
		first.set(year, month, day);

		first.add(Calendar.DATE, 300);
		System.out.printf("300일 : %tF%n", first);
		first.set(year, month, day);
		
		first.add(Calendar.DATE, 500);
		System.out.printf("500일 : %tF%n", first);
		first.set(year, month, day);
		
		first.add(Calendar.DATE, 1000);
		System.out.printf("1000일 : %tF%n", first);
		first.set(year, month, day);
	}
	
}
