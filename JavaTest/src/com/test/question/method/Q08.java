package com.test.question.method;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q08 {
	
	public static void main(String[] args) throws Exception{
//		사과 나무 씨앗을 심을 날로부터 특정 시간이 흘렀을 때 사과 총 몇 개가 열리는지 구하느 ㄴ메소드를 선언하시오.
		
//		설계>
//		1. BuffereReader
//		2. 맑은 날 : 출력
//		3. 맑은 날 입력
//		4. 흐린 날 : 출력
//		5. 흐린 날 입력
//		6. 입력 받은 값을 int로 변환
//		7. int getApple(int, int) 메소드 생성 
//		-> int*0.05 + int*0.02, 1m 넘는 시점부터 10cm 마다 사과 +1개씩
//		8. 사과가 총 개 열렸습니다.
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("맑은 날 : ");
		String input1 = reader.readLine();
		System.out.print("흐린 날 : ");
		String input2 = reader.readLine();
		
		int sunnyDay = Integer.parseInt(input1);
		int cloudyDay = Integer.parseInt(input2);
		
		System.out.printf("사과가 총 %d개 열렸습니다.%n", getApple(sunnyDay, cloudyDay));
	}

	private static int getApple(int sunnyDay, int cloudyDay) {
		int height = sunnyDay * 5 + cloudyDay * 2;
		int apple = (height - 100) / 10 + 1 ; 
		int getApple = apple > 0 ? apple : 0;
		return getApple;
	}

}
