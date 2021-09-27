package com.test.question.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q12 {

	public static void main(String[] args) throws Exception{
		/*
		연산식을 입력 받아 실제 연산을 하시오.
		
		설계>
		1. BufferedReader
		2. 연산식 입력
		3. indexOf로 산술연산자 확인
		4. if문
			>올바른 연산자인지 확인
			>피연산자 변수 저장
			>if문 피연산자 확인
		*/
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String input = reader.readLine();
		
		int index = -1;
		index += input.indexOf('+') + 1;
		index += input.indexOf('-') + 1;
		index += input.indexOf('*') + 1;
		index += input.indexOf('/') + 1;
		index += input.indexOf('%') + 1;
		
		if (index == -1) {
			System.out.println("연산자가 올바르지 않습니다.");
		} else {
			String trimA = input.substring(0, index).trim();
			String trimB = input.substring(index + 1).trim();

			if (trimA.length() == 0 || trimB.length() == 0 ) {
				System.out.println("피연산자가 부족합니다.");
			} else {
				int a = Integer.parseInt(trimA);
				int b = Integer.parseInt(trimB);
				
				switch(input.charAt(index)) {
				case '+' :
					System.out.printf("%d + %d = %d%n", a, b, a + b);
					break;
				case '-' :
					System.out.printf("%d - %d = %d%n", a, b, a - b);
					break;
				case '*' :
					System.out.printf("%d * %d = %d%n", a, b, a * b);
					break;
				case '/' :
					System.out.printf("%d / %d = %d%n", a, b, a / b);
					break;
				case '%' :
					System.out.printf("%d %% %d = %d%n", a, b, a % b);
					break;
				}
			}
		}
	}
}
