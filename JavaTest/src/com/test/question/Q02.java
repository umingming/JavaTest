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
		//1. BufferedLeader 생성.
		//2. "첫 번째 숫자: " 출력
		//3. 첫 번째 숫자 입력
		//4. "두 번째 숫자: " 출력
		//5. 두 번째 숫자 입력
		//6. 첫 번째 숫자 int로 변경
		//7. 두 번째 숫자 int로 변경
		//8. 첫 번째 숫자 + 두 번째 숫자 = 결과값 출력하기
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("첫 번째 숫자: ");
		String num1 = reader.readLine();
		System.out.print("두 번째 숫자: ");
		String num2 = reader.readLine();
		
		int intNum1 = Integer.parseInt(num1);
		int intNum2 = Integer.parseInt(num2);
		
		System.out.printf("%s + %s = %d", num1, num2, (intNum1 + intNum2) );
		
		
	}

}
