package com.test.question.for_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q06 {

	public static void main(String[] args) throws NumberFormatException, IOException {
//		1 - 2 + 3 - 4 + 5 - 6 + 7 - 8 + 9 - 10 = -5
		
//		설계>
//		1. BufferedReader
//		2. int로 시작과 종료 숫자 입력 받기
//		3. int와 String으로 sum 변수 생성 후 시작 숫자와 ""로 초기화
//		4. for문
//			>i가 시작+1부터 종료까지 1씩 증가
//			>int sum에 짝수번째는 +, 홀수번째는 - 연산
//			>String도 마찬가지
//		5. 결과 출력
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("시작 숫자 : ");
		int start = Integer.parseInt(reader.readLine());
		System.out.print("종료 숫자 : ");
		int end = Integer.parseInt(reader.readLine());
	
		int sum = start;
		String process = sum + "";
		
		for(int i=start+1; i<=end; i++) {
			if(i % 2 == start % 2) {
				sum += i;
				process = process + " + " + i;
			} else {
				sum -= i;
				process = process + " - " + i;
			}
		}
		System.out.println(process + " = " + sum);
	}

}
