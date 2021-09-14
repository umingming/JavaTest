package com.test.question.operator;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q02 {

	public static void main(String[] args) throws Exception{
//		숫자 2개를 입력 받아 아래의 연산 과정과 연산 결과를 출력하시오.
//		
//		설계>
//		1. BufferedReader
//		2. 첫 번째 숫자: 출력
//		3. 첫 번째 숫자(input1) 입력
//	    4. 두 번째 숫자: 출력
//	    5. 두 번째 숫자(input2) 입력
//	    6. 입력 받은 숫자를 int로 변환
//	    7. input1 +, -, *, /, % input2 = 출력(천단위, 나누기는 소수 첫째 자리까지 표기 )

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("첫 번째 숫자: ");
		String input1 = reader.readLine();
		System.out.print("두 번째 숫자: ");
		String input2 = reader.readLine();
		
		int num1 = Integer.parseInt(input1);
		int num2 = Integer.parseInt(input2);
		
		System.out.printf("%,d + %,d = %,d%n", num1, num2, (num1 + num2));
		System.out.printf("%,d - %,d = %,d%n", num1, num2, (num1 - num2));
		System.out.printf("%,d * %,d = %,d%n", num1, num2, (num1 * num2));
		System.out.printf("%,d / %,d = %,.1f%n", num1, num2, (double)(num1 / num2));
		System.out.printf("%,d %% %,d = %,d%n", num1, num2, (num1 % num2));

	}

}
