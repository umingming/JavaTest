package com.test.question.datetime;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Calendar;


public class Q06 {

	public static void main(String[] args) throws Exception{

//		여러 배달 음식을 같은 시간에 받으려면 몇 시에 전화해야 하는지 알려주시오.
		
//		설계>
//		1. BufferedReader
//		2. 음식을 받기 원하는 시각 시: 분 : 출력 후 입력 받기
//		3. 입력 받은 값을 int로 변환
//		4. Calendar 로 시각 수정
//		5. 짜장면 전화 시간은 add 이용해 -10 후 짜장면 : 시 분 출력
//		6. 치킨과 피자도 4번과 같이 반복
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("음식을 받기 원하는 시각");
		System.out.print("시 : ");
		String input1 = reader.readLine();
		System.out.print("분 : ");
		String input2 = reader.readLine();
		
		int hour = Integer.parseInt(input1);
		int min = Integer.parseInt(input2);
		
		Calendar time = Calendar.getInstance();
		time.set(Calendar.HOUR_OF_DAY, hour);
		time.set(Calendar.MINUTE, min);
		time.add(Calendar.MINUTE, -10);
		System.out.printf("짜장면 : %d시 %d분%n", time.get(Calendar.HOUR_OF_DAY), time.get(Calendar.MINUTE));
		
		time.set(Calendar.HOUR_OF_DAY, hour);
		time.set(Calendar.MINUTE, min);
		time.add(Calendar.MINUTE, -18);
		System.out.printf("치킨 : %d시 %d분%n", time.get(Calendar.HOUR_OF_DAY), time.get(Calendar.MINUTE));

		time.set(Calendar.HOUR_OF_DAY, hour);
		time.set(Calendar.MINUTE, min);
		time.add(Calendar.MINUTE, -25);
		System.out.printf("피자 : %d시 %d분%n", time.get(Calendar.HOUR_OF_DAY), time.get(Calendar.MINUTE));
	}

}
