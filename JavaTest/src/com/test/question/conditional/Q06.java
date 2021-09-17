package com.test.question.conditional;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q06 {

	public static void main(String[] args) throws Exception{
//		영문자 1개를 입력 받아 대/소문자 변환을 한 뒤 출력하시오.
		
//		설계>
//		1. BufferedReader
//		2. int로 문자를 입력 받음.
//		3. if문> 대문자->소문자, 소문자->대문자로 변환해 출력

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("문자 : ");
		int ch = reader.read();
		
		if (ch >= 65 && ch <= 90) {
			System.out.printf("결과 : %c", ch + 32);
		} else if (ch >= 97 && ch <= 122) {
			System.out.printf("결과 : %c", ch - 32);
		} else {
			System.out.println("영문자를 입력해주세요.");
		}
	}
}
