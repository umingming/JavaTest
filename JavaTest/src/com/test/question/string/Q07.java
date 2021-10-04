package com.test.question.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q07 {

	public static void main(String[] args) throws Exception{
		/*
		숫자를 입력 받아 3자리마다 ,를 붙이시오.
		
		설계>
		1. BufferedReader
		2. 숫자 입력
		3. num 변수 선언
		4. for문 숫자 길이 반복
			>num = charAt(i)
			>if문 i % 3 == length % 3 
				>, 추가
		5. 결과 출력
		 */
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("숫자 : ");
		String input = reader.readLine();
		
		String num = "";
		String result = "";
		
		int length = input.length();
		
		for(int i=0; i<length; i++) {
			num = "" + input.charAt(i);
			
			if((i % 3 == (length-1) % 3) && length != 3) {
				result += num + "," ;
			} else {
				result += num;
			}
		}
		System.out.printf("결과 : %s", result.substring(0, result.lastIndexOf(",")));
	}

}
