package com.test.question.for_;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q14 {
	
	public static void main(String[] args) throws Exception{
//		최대 9자리 정수를 입력받아 각자리의 홀수 숫자합과 짝수 숫자합을 구하시오.
//		-9자리가 넘어가면 동작 금지

//		설계>
//		1. BufferedReader
//		2. 9자리 숫자 입력 받기
//		3. length 변수로 글자수 확인
//		4. 짝수 홀수 변수 선언 후 초기화
//		5. if문 
//			> 9자리가 넘어가면 "잘못 입력했습니다." 출력
//			> 9자리 이내면 for문 length만큼 반복
//				>i번째 문자를 digit 변수에 저장
//				>if문으로 짝수인지 홀수인지 판별 후 더하기
//		6. 결과 출력
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("9자리 숫자 입력 : ");
		String input = reader.readLine();
		
		int length = input.length();
		int even = 0;
		int odd = 0;
		
		if(length <= 9) {
			int num = Integer.parseInt(input);
			for(int i=0; i<length; i++) {
				int digit = Integer.parseInt(input.charAt(i)+"");
				if(digit % 2 == 0) {
					even += digit;
				} else {
					odd += digit;
				}
			}
			System.out.printf("짝수의 합 : %d%n", even);
			System.out.printf("홀수의 합 : %d%n", odd);
		} else {
			System.out.println("잘못 입력했습니다.");
		}
	}

}
