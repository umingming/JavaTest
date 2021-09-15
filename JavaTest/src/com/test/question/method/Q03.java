package com.test.question.method;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q03 {

	public static void main(String[] args) throws Exception{
//		숫자 1개를 입력 받아 4자리로 출력하는 메소드를 선언하고 호출하시오.
		
//		설계>
//		1. BufferedReader
//		2. 숫자 입력 : 출력
//		3. readLine() 사용해 숫자 입력
//		4. 입력된 숫자를 int로 변환
//		5. digit(int) 호출
//		6. digtin(int) 메소스 생성 > 1 -> 0001 출력
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.printf("숫자 입력 : ");
		String input = reader.readLine();
		int num = Integer.parseInt(input);
		digit(num);
	}

	private static void digit(int num) {
		System.out.printf("%d -> %04d", num, num);
	}

}
