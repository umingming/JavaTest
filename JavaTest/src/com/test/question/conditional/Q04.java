package com.test.question.conditional;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q04 {

	public static void main(String[] args) throws Exception{
//		근무 년수를 입력 받아 아래와 같이 출력하시오.
		
//		설계>
//		1. BufferedReader
//		2. int로 근무 년수 입력 받음
//		3. if문> 년차에 따라 다른 문장을 출력
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("근무 년수 : ");
		int year = Integer.parseInt(reader.readLine());

		if (year >= 10) {
			System.out.printf("%d년차 고급 개발자입니다.%n", year);
			System.out.printf("당신은 %d년 전까지 초급 개발자였습니다.%n", year - 4);
			System.out.printf("당신은 %d년 전까지 중급 개발자였습니다.%n", year - 9);
		
		} else if (year > 5) {
			System.out.printf("%d년차 중급 개발자입니다.%n", year);
			System.out.printf("당신은 %d년 전까지 초급 개발자였습니다.%n", year - 4);
			System.out.printf("앞으로 %d년 더 근무를 하면 고급 개발자가 됩니다.%n", 10 - year);
		
		} else if (year >= 1 && year <= 4) {
			System.out.printf("%d년차 초급 개발자입니다.%n", year);
			System.out.printf("앞으로 %d년 더 근무를 하면 중급 개발자가 됩니다.%n", 5 - year);
			System.out.printf("앞으로 %d년 더 근무를 하면 고급 개발자가 됩니다.%n", 10 - year);
		
		} else {
			System.out.println("다시 입력하세요.");
		}
	}

}
