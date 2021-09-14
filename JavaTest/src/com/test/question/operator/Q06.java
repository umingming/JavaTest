package com.test.question.operator;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q06 {

	public static void main(String[] args) throws Exception{
//		영문 소문자를 1자 입력 받은 후 대문자로 변환해서 출력하시오.
		
//		설계>
//		1. BufferedReader
//		2. 문자 입력: 출력
//		3. read() 사용해 입력
//		4. 소문자 ' '의 대문자는 ' '입니다. 출력
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("문자 입력 : ");
		int input = reader.read();
		System.out.printf("소문자 '%c'의 대문자는 '%c'입니다.%n", (char)input, (char)(input-32));

	}

}
