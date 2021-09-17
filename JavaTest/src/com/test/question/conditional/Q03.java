package com.test.question.conditional;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q03 {

	public static void main(String[] args) throws Exception{
//		문자를 입력 받아 아래와 같이 출력함
		
//		설계>
//		1. BufferedReader
//		2. 문자 하나를 입력 받기
//		3. switch문, if문 메소드 생성> 입력 문자에 따른 단어 출력
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("문자 : ");
		String input = reader.readLine();
		
		ifCase(input);
		switchCase(input);
	}//main

	private static void switchCase(String input) {
		switch (input) {
		case "f", "F" :
			System.out.println("Father");
			break;
		case "m", "M" :
			System.out.println("Mother");
			break;
		case "s", "S" :
			System.out.println("Sister");
			break;
		case "b", "B" :
			System.out.println("Brother");
			break;
		}
	}//switchCase

	private static void ifCase(String input) {

		if(input.equals("f") || input.equals("F")) {
			System.out.println("Father");
		} else if(input.equals("m") || input.equals("M")) {
			System.out.println("Mother");
		} else if(input.equals("s") || input.equals("S")) {
			System.out.println("Sister");
		} else if(input.equals("b") || input.equals("B")) {
			System.out.println("Brother");
		}
	}//ifCase
}
