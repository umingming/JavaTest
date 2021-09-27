package com.test.question.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q09 {

	public static void main(String[] args) throws Exception {
		/*
		금지어를 마스킹 처리 하시오.
		-금지어 바보, 멍청이
		
		1. num, ban 변수 선언
		2. for문 무한루프
			>BufferedReader
			>문장 입력
			>index 변수 선언
			>if문 indexOf로 바보, 멍청이가 있는지 확인
				>있으면 replace, num++
			>input 출력
		 */
		
		int num = 0;
		
		for(;;) {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String input = reader.readLine();
			
			int index = -1;
			index = input.indexOf("바보");
			if(index != -1) {
				num++;
				input = input.replace("바보", "**");
			}
			
			index = -1;
			index = input.indexOf("멍청이");
			if(index != -1) {
				num++;
				input = input.replace("멍청이", "***");
			}
			
			System.out.println(input);
			System.out.printf("금지어를 %d회 마스킹했습니다.", num);
		}
	}

}
