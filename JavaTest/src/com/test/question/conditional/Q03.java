package com.test.question.conditional;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q03 {

	public static void main(String[] args) throws Exception{
//		문자를 입력 받아 아래와 같이 출력함
		
//		설계>
//		1. BufferedReader
//		2. 문자 하나를 입력 받기
//		3. switch문으로 입력 문자에 따른 단어 출력
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("문자 : ");
		String input = reader.readLine();
		
		switch (input) {
		case "f" : 
		case "F" :
			System.out.println("Father");
			break;
		case "m" : 
		case "M" :
			System.out.println("Mother");
			break;
		case "s" : 
		case "S" :
			System.out.println("Sister");
			break;
		case "b" : 
		case "B" :
			System.out.println("Brother");
			break;
		}
	}
}
