package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex09_BufferedReader {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader 
		 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("문자 입력: ");
		int code = reader.read();  //문자 코드값 변환
		System.out.printf("%c%n",code);
		
		
		
//		클래스 > 코드의 집합 > 구현된 기능의 집합

	}

}
