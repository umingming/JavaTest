package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q02 {

	public static void main(String[] args) throws IOException {
		//숫자 2개를 입력 받아, 연산과정과 결과를 모두 출력
		//입력] 첫 번째 숫자: 5
		//     두 번째 숫자: 3
		//출력] 5 + 3 = 8

		//설계
		//1. BufferedReader 생성.
		//2. "첫 번째 숫자: " 출력
		//3. 첫 번째 숫자 입력
		//4. "두 번째 숫자: " 출력
		//5. 두 번째 숫자 입력
		//6. 첫 번째 숫자 int로 변경
		//7. 두 번째 숫자 int로 변경
		//8. 첫 번째 숫자 + 두 번째 숫자 = 결과값 출력하기
		
		 
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("첫 번째 숫자: ");
		String input1 = reader.readLine();
		System.out.print("두 번째 숫자: ");
		String input2 = reader.readLine();
		
		int num1 = Integer.parseInt(input1);
		int num2 = Integer.parseInt(input2);
		
		System.out.printf("%,d + %,d = %,d%n", num1, num2, (num1 + num2) );
		
		
	}

}
