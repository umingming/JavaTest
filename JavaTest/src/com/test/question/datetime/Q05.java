package com.test.question.datetime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Q05 {

	public static void main(String[] args) throws IOException{
//		아빠와 딸의 생일을 입력 받아 아빠가 딸보다 며칠을 더 살았는지 출력하시오.
		
//		설계>
//		1. tick 메소드 생성
//			>BufferedReader
//			>생일(년, 월, 일)을 각각 int로 입력 받음
//			>입력 값으로 시각 수정
//			>tick값 구해서 리턴함.
//		2. 변수의 값으로 tick(아빠, 딸) 호출
//		3. 아빠는 딸보다 총 일을 더 살았습니다. 출력

		long dad = tick("아빠");
		long daughter = tick("딸");
		
		System.out.printf("아빠는 딸보다 총 %d일을 더 살았습니다."
				, (daughter - dad) / 1000 / 60 / 60 / 24);
	}

	private static long tick(String family) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.printf("%s 생일(년) : ", family);
		int year = Integer.parseInt(reader.readLine());
		System.out.printf("%s 생일(월) : ", family);
		int month = Integer.parseInt(reader.readLine());
		System.out.printf("%s 생일(일) : ", family);
		int date = Integer.parseInt(reader.readLine());
		
		Calendar birth = Calendar.getInstance();
		birth.set(year, month-1, date);
		long tick = birth.getTimeInMillis();
		
		return tick;
	}

}
