package com.test.question.conditional;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q01 {

	public static void main(String[] args) throws Exception {
//		숫자 2개를 입력 받아 큰 수와 작은 수 출력

//		설계>
//		1. input 메소드 생성
//			>BufferedReader
//			>입력값을 int로 리턴
//		2. if 문
//			>두 수를 비교하고 큰 수와 작은 수는 무엇인지
//			>입력한 두 숫자의 차이를 출력
		
		int num1 = input("첫 번째 숫자");
		int num2 = input("두 번째 숫자");
		
		if(num1 > num2) {
			System.out.printf("큰 수는 %,d이고, 작은 수는 %,d입니다.%n", num1, num2);
			System.out.printf("입력한 두 숫자는 %,d 차이가 납니다.%n", num1 - num2);
		} else if (num1 < num2)	{
			System.out.printf("큰 수는 %,d이고, 작은 수는 %,d입니다.%n", num2, num1);
			System.out.printf("입력한 두 숫자는 %,d 차이가 납니다.%n", num2 - num1);
		} else {
			System.out.println("두 수가 같습니다.");
		}
		
	}//main

	private static int input(String str) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.printf("%s : ", str);
		return Integer.parseInt(reader.readLine());
	}//input

}
