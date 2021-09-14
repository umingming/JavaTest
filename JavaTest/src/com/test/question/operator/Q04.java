package com.test.question.operator;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q04 {

	public static void main(String[] args) throws Exception{
//		바퀴의 지름이 26인치인 자전거가 있다. 페달을 밟은 횟수를 입력하면 자전거가 총 몇m를 달렸는지 출력하시오.

//		설계>
//		1. BufferedReader 
//		2. 사용자가 페달을 밟은 횟수 : 출력
//		3. 횟수 입력
//		4. 횟수를 int로 변환
//		5. 이동 거리 계산
//		6. 사용자가 총 회 페달을 밟아 자전거가 총 m를 달렸습니다. 출력
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("사용자가 페달을 밟은 횟수 : ");
		String input = reader.readLine();
		int num = Integer.parseInt(input);
		double distance = num * 2 * 3.14 * ( 13 * 0.254 );
		System.out.printf("사용자가 총 %,d회 페달을 밟아 자전거가 총 %,dm를 달렸습니다.%n", num, (int)distance);
		
	}

}
