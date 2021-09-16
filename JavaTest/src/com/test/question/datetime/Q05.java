package com.test.question.datetime;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Q05 {

	public static void main(String[] args) throws Exception{
//		아빠와 딸의 생일을 입력 받아 아빠가 딸보다 며칠을 더 살았는지 출력하시오.
		
//		설계>
//		1. BufferedReader
//		2. 아빠,딸 생일(년, 월, 일) : 출력 후 각 입력
//		3. 생일 입력값들 int 로 변환
//		4. 아빠 생일 시각으로 변환하고 tick 값 구하기
//		5. 딸 생일 시각으로 변환하고 tick 값 구하기
//		7. 아빠 생일 - 딸 생일
//		8. 아빠는 딸보다 총 일을 더 살았습니다. 출력

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("아빠 생일(년) : ");
		String inputDad1 = reader.readLine();
		int yearDad = Integer.parseInt(inputDad1);

		System.out.print("아빠 생일(월) : ");
		String inputDad2 = reader.readLine();
		int monthDad = Integer.parseInt(inputDad2);
		
		System.out.print("아빠 생일(일) : ");
		String inputDad3 = reader.readLine();
		int dayDad = Integer.parseInt(inputDad3);

		System.out.print("딸 생일(년) : ");
		String inputDaughter1 = reader.readLine();
		int yearDaughter = Integer.parseInt(inputDaughter1);
		
		System.out.print("딸 생일(월) : ");
		String inputDaughter2 = reader.readLine();
		int monthDaughter = Integer.parseInt(inputDaughter2);
		
		System.out.print("딸 생일(일) : ");
		String inputDaughter3 = reader.readLine();
		int dayDaughter = Integer.parseInt(inputDaughter3);
		
		Calendar dad = Calendar.getInstance();
		dad.set(yearDad, monthDad-1, dayDad);

		Calendar daughter = Calendar.getInstance();
		daughter.set(yearDaughter, monthDaughter-1, dayDaughter);
		
		long dadTick = dad.getTimeInMillis();
		long daughterTick = daughter.getTimeInMillis();
		long day = ( daughterTick - dadTick) / 1000/ 60 / 60/ 24;
		
		System.out.printf("아빠는 딸보다 총 %d일을 더 살았습니다.", day );
	}

}
