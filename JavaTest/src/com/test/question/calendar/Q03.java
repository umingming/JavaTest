package com.test.question.calendar;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Q03 {

	public static void main(String[] args) throws Exception{
		/*
		태어난 년도를 입력하면 나이를 출력하시오.
		
		설계>
		1. BufferedReader
		2. 년도 입력
		3. Calendar
		4. 현재 년도 구하기
		5. 나이 계산
		6. 출력
		*/
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("태어난 년도 : ");
		int input = Integer.parseInt(reader.readLine());
		
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		
		int age = year - input + 1;
		
		System.out.printf("나이 : %d세", age);
	}

}
