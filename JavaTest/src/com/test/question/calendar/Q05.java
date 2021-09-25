package com.test.question.calendar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Q05 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		/*
		아빠와 딸의 생일을 입력받아 아빠가 딸보다 며칠을 더 살았는지 출력하시오.
		
		설계>
		1. 생일 메소드 생성
			>BufferedReader
			>생일 입력 받기
			>Calendor
			>set으로 생일 저장
			>tick 구해서 리턴함
		2. (딸 tict - 아빠 tick)/1000/60/60/24
		3. 결과 출력
		*/
		
		long dadTick = tick("아빠");
		long daughterTick = tick("딸");
		
		long difference = (daughterTick - dadTick) / 1000 / 60 / 60 / 24;
		
		System.out.printf("아빠는 딸보다 총 %,d일을 더 살았습니다.", difference);
	}

	private static long tick(String str) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.printf("%s 생일(년) : ", str);
		int year = Integer.parseInt(reader.readLine());

		System.out.printf("%s 생일(월) : ", str);
		int month = Integer.parseInt(reader.readLine());
		
		System.out.printf("%s 생일(일) : ", str);
		int date = Integer.parseInt(reader.readLine());
		
		Calendar birth = Calendar.getInstance();
		birth.set(year, month, date);
		
		return birth.getTimeInMillis();
	}

}
