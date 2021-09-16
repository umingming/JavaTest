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
//		4. time 메소드 생성
//			>현재 시각을 입력받은 값(시, 분)들을 이용해 수정
//			>입력 값 만큼 시각에서 빼줌 
//			>메뉴 : 00시 00분 출력
//		5. time(짜장면, 치킨, 피자)로 호출
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("음식을 받기 원하는 시각");
		System.out.print("시 : ");
		String input1 = reader.readLine();
		System.out.print("분 : ");
		String input2 = reader.readLine();
		
		int hour = Integer.parseInt(input1);
		int min = Integer.parseInt(input2);
		
		time(hour, min, 10, "짜장면");
		time(hour, min, 18, "치킨");
		time(hour, min, 25, "피자");
	}

	private static void time(int hour, int min, int call, String menu) {
		Calendar time = Calendar.getInstance();
		time.set(Calendar.HOUR_OF_DAY, hour);
		time.set(Calendar.MINUTE, min);
		time.add(Calendar.MINUTE, -call);

		System.out.printf("%s : %d시 %d분%n", menu, time.get(Calendar.HOUR_OF_DAY), time.get(Calendar.MINUTE));
	}

}
