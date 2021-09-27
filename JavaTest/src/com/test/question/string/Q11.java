package com.test.question.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q11 {

	public static void main(String[] args) throws Exception{
		/*
		입력받은 문장에서 숫자들을 찾아 그 합을 구하시오.
		-연속된 숫자는 1자리씩 더할 것
		
		설계>
		1. BufferedReader
		2. 문장 입력
		3. sum, ch 변수 선언
		4. for문 문장 길이만큼
			>ch에 charAt(i) 저장
			>if ch가 1~9인지 확인
				>맞으면 int로 변경하고 sum에 저장
		5. 결과 출력
		 */
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String input = reader.readLine();
		
		int sum = 0;
		int num = 0;
		char ch = ' ';
		
		for(int i=0; i<input.length(); i++) {
			ch = input.charAt(i);
			if(ch > '0' && ch <= '9') {
				num = Integer.parseInt("" + ch);
				sum += num;
			}
		}
		
		System.out.printf("문장에 존재하는 모든 숫자의 합은 %d입니다.", sum);
	}
}
