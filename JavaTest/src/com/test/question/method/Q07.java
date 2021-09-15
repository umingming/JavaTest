package com.test.question.method;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q07 {

	public static void main(String[] args) throws Exception{
//		지하철 탑승 소요 시간을 구하시오. 
//		지나가는 역의 개수, 환승역의 횟수 등을 전달 받아 총 걸리는 시간을 반환
		
//		설계>
//		1. BufferedReader
//		2. 역의 개수 : 출력
//		3. 개수 입력
//		4. 환승역의 횟수 : 출력
//		5. 횟수 입력
//		6. 입력 받은 값들을 int 로 변환
//		7. getTime(int 역, int 환승역) 메소드 생성> int역*2+int환승*3 = 결과 반환
//		8. 총 소요 시간은 분입니다. 출력
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("역의 개수 : ");
		String input1 = reader.readLine();
		System.out.print("환승역의 횟수 : ");
		String input2 = reader.readLine();
		int num1 = Integer.parseInt(input1);
		int num2 = Integer.parseInt(input2);
		System.out.printf("총 소요 시간은 %d분입니다.%n", getTime(num1, num2));
		System.out.print("시간대 : ");
		String input3 = reader.readLine();
		int num3 = (input3.equals("평상") ? 3 : (input3.equals("출근") ? 4 : 5) );
		System.out.printf("총 소요 시간은 %d분입니다.%n", getTime(num1, num2, num3));
	}

	private static int getTime(int num1, int num2) {
		int getTime = num1 * 2 + num2 * 3;
		return getTime;
	}
	
	private static int getTime(int num1, int num2, int num3) {
		int getTime = num1 * 2 + num2 * num3;
		return getTime;
	}

}
