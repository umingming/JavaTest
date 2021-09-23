package com.test.question.for_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q04 {

	public static void main(String[] args) throws NumberFormatException, IOException {
//		숫자 10개를 입력 받아 짝수의 합과 홀수의 합을 각각 출력하시오.
		
//		설계>
//		1. BufferedReader 사용
//		2. 입력받을 숫자의 개수를 입력 받기
//		3. 짝수와 홀수 변수 선언 후 초기화
//		4. for문
//			>입력 받은 숫자만큼 반복
//			>숫자 입력 받고
//			>if문
//				>숫자가 홀수 짝수인지 구분해 맞는 변수에 더하기
//		5.짝수,홀수 합 출력
			
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("입력 받을 숫자의 개수 : ");
		int input = Integer.parseInt(reader.readLine());
		int even = 0;
		int odd = 0;
		
		for(int i=0; i<input; i++) {
			System.out.print("숫자 : ");
			int num = Integer.parseInt(reader.readLine());
			if(num % 2 == 0) {
				even += num;
			} else {
				odd += num;
			}
		}
		
		System.out.printf("짝수의 합 : %,d%n", even);
		System.out.printf("홀수의 합 : %,d%n", odd);
	}

}
