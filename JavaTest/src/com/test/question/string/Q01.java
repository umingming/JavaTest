package com.test.question.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q01 {
	public static void main(String[] args) throws Exception{
		/*
		문장을 입력받아 역순으로 출력하시오.
		
		설계>
		1. BufferedReader
		2. 문장 입력
		3. reverse 변수 선언
		4. for문 문장의 길이 반복
			>reverse += charAt(txt.length()-i)
		5. reverse 출력
		*/
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("문장 입력 : ");
		String txt = reader.readLine();

		String reverse = "";
		
		for(int i=0; i<txt.length(); i++) {
			reverse += "" + txt.charAt(txt.length() - i - 1) ;
		}
		
		System.out.printf("역순 결과 : %s%n", reverse);
	}

}
