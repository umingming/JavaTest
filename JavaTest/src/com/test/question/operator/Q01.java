package com.test.question.operator;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q01 {

	public static void main(String[] args) throws Exception{
//		태어난 년도를 입력 받아 나이를 출력하시오.

//		설계>
//		1. BufferedReader
//		2. 태어난 년도: 출력
//		3. 년도 입력
//		4. 년도를 int로 변환
//		5. 나이 계산
//		6. 나이: 출력
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("태어난 년도: ");
		String input = reader.readLine();
		
		int year = Integer.parseInt(input);
		int age = 2021 - year + 1;
		
		System.out.printf("나이: %d%n", age);
		

	}

}
