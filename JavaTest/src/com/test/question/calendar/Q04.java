package com.test.question.calendar;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.Set;

public class Q04 {

	public static void main(String[] args) throws Exception{
		/*
		남녀 커플의 이름과 만난날을 입력 받아 기념일을 출력하시오.
		
		설계>
		1. BufferedReader
		2. 남자이름, 여자이름 입력
		3. 만난날(년, 월, 일) 입력
		4. 기념일 메소드 생성 
			>Calendar
			>add 이용해 DATE에 더하기
			>결과 출력
		*/
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("남자 이름 : ");
		String man = reader.readLine();
		
		System.out.print("여자 이름 : ");
		String woman = reader.readLine();
		
		System.out.print("만난날(년) : ");
		int year = Integer.parseInt(reader.readLine());

		System.out.print("만난날(월) : ");
		int month = Integer.parseInt(reader.readLine()) - 1;
		
		System.out.print("만난날(일) : ");
		int date = Integer.parseInt(reader.readLine());
		
		Calendar first = Calendar.getInstance();
		first.set(year, month, date);
		
		System.out.printf("'%s'과(와) '%s'의 기념일%n", man, woman);
		
		anniversary(first, 100);
		anniversary(first, 200);
		anniversary(first, 300);
		anniversary(first, 700);
		anniversary(first, 1000);
		
	}

	private static void anniversary(Calendar first, int day) {
		first.add(Calendar.DATE, day);
		System.out.printf("%d일 : %tF%n", day, first);
		first.add(Calendar.DATE, -day);
	}

}
