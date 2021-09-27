package com.test.question.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q08 {

	public static void main(String[] args) throws Exception{
		/*
		영어 단어를 1개 입력 받아 아래와 같이 출력하시오.

		설계>
		1. BufferedReader
		2. 단어 입력
		3. ch, result 변수 선언
		4. for문 단어 길이 반복
			>char = i
			>if문으로 대문자이고 i가 0이 아닌지 확인
				>공백 추가함
		5. 결과 출력
		*/
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("단어 : ");
		String word = reader.readLine();

		char ch = ' ';
		String result = "";
		
		for(int i=0; i<word.length(); i++) {
			ch = word.charAt(i);
			if(ch > 'A' && ch < 'Z' && i != 0) {
				result += " " + ch;
			} else {
				result += ch;
			}
		}
		
		System.out.printf("결과 : %s", result);
	}

}
