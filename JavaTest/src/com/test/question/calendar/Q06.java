package com.test.question.calendar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Q06 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		/*
		여러 음식을 같은 시간에 배달 받으려면 각각의 매장에 몇 시에 전화를 해야하는지 알려주시오.
		-짜장면은 10분 뒤에 도착
		-치킨은 18분 뒤 도착
		-피자는 25분 뒤 도착
		
		설계>
		1. BufferedReader
		2. 원하는 시각 입력
		3. Calendar
		4. set으로 시각 수정
		5. 전화할 시간 메소드 생성
			>add로 필요한 시간만큼 빼기
			>결과 출력
		*/
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("음식을 받기 원하는 시각");
		System.out.print("시 : ");
		int hour = Integer.parseInt(reader.readLine());
		
		System.out.print("분 : ");
		int min = Integer.parseInt(reader.readLine());
		
		Calendar time = Calendar.getInstance();
		time.set(Calendar.HOUR, hour);
		time.set(Calendar.MINUTE, min);
		
		call(time, "짜장면", 10);
		call(time, "치킨", 18);
		call(time, "피자", 25);
	}

	private static void call(Calendar time, String menu, int delivery) {
		time.add(Calendar.MINUTE, -delivery);
		System.out.printf("%s : %d시 %d분%n", menu, time.get(Calendar.HOUR), time.get(Calendar.MINUTE));
		time.add(Calendar.MINUTE, delivery);
	}
}

