package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex09_BufferedReader {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader 
		 = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("문자 입력: ");
		int code = reader.read();  //문자 코드값 변환
		System.out.printf("%d%n",code);
		
		reader.readLine();
		
		code = reader.read();  //문자 코드값 변환
		System.out.printf("%c%n",code);
		
		
		System.out.print("이름 입력: ");
		String name = reader.readLine();  //문자열 입력

		System.out.printf("안녕하세요. %s님.%n", name);
		
		System.out.print("나이 입력: ");
		String age = reader.readLine();
		System.out.printf("당신의 나이는 %s살 이군요%n", age);
		
		
		
		
//		클래스 > 코드의 집합 > 구현된 기능의 집합

	}

}
