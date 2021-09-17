package com.test.question.conditional;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q05 {

	public static void main(String[] args) throws Exception{
//		숫자 2개와 연산자 1개를 입력 받아 연산 과정과 결과를 출력하시오.
//		
//		설계>
//		1. input 메소드 생성
//			> BufferedReader
//			> 입력 값 리턴
//		2. input(첫 번째 숫자, 두 번째 숫자) 호출하고 int로 형변환
//		3. String의 변수로 input(연산자) 호출
//		4. switch문, if문 메소드 생성
//			> 연산자에 따라 연산 과정을 수행하고 출력함
		

		int num1 = Integer.parseInt(input("첫 번째 숫자"));
		int num2 = Integer.parseInt(input("두 번째 숫자"));
		String operator = input("연산자");
		
		ifCase(num1, num2, operator);
		switchCase(num1, num2, operator);
		
	}//main

	private static void switchCase(int num1, int num2, String operator) {
		switch (operator) {
		case "+" :
			System.out.printf("%,d + %,d = %,d%n", num1, num2, num1 + num2);
			break;
		case "-" :
			System.out.printf("%,d - %,d = %,d%n", num1, num2, num1 - num2);
			break;
		case "*" :
			System.out.printf("%,d * %,d = %,d%n", num1, num2, num1 * num2);
			break;
		case "/" :
			System.out.printf("%,d / %,d = %,.1f%n", num1, num2, num1 / (double) num2);
			break;
		case "%" :
			System.out.printf("%,d %% %,d = %,d%n", num1, num2, num1 % num2);
			break;
		}
	}//switchCase

	private static void ifCase(int num1, int num2, String operator) {
		if(operator.equals("+")) {
			System.out.printf("%,d + %,d = %,d%n", num1, num2, num1 + num2);
		} else if(operator.equals("-")) {
			System.out.printf("%,d - %,d = %,d%n", num1, num2, num1 - num2);
		} else if(operator.equals("*")) {
			System.out.printf("%,d * %,d = %,d%n", num1, num2, num1 * num2);
		} else if(operator.equals("/")) {
			System.out.printf("%,d / %,d = %,.1f%n", num1, num2, num1 / (double) num2);
		} else if(operator.equals("*")) {
			System.out.printf("%,d %% %,d = %,d%n", num1, num2, num1 % num2);
		}
	}//ifCase

	private static String input(String str) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.printf("%s : ", str);
		String input = reader.readLine();
		return input;
	}

}
