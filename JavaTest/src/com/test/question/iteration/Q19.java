package com.test.question.iteration;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q19 {

	public static void main(String[] args) throws Exception{
		/*
		숫자 2개 입력 받아 각각의 약수와 두 숫자의 공약수를 구하시오.
		
		설계>
		1. BufferedReader
		2. 숫자 2개 입력 받기
		3. 약수1, 2, 3 변수 선언
		4. 들 중 큰 수를 max 변수에 저장
		5. for문 2부터 max까지 반복
			>if문 (num1 % i == 0) >약수 += , i
			>if문 (num2 % i == 0) >약수 += , i
			>if문 (num1 % i == 0 && num2 % i == 0) >약수 += , i
		6. 출력
		*/
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("첫 번째 숫자 : ");
		int num1 = Integer.parseInt(reader.readLine());

		System.out.print("두 번째 숫자 : ");
		int num2 = Integer.parseInt(reader.readLine());
		
		String divisor1 = "1";
		String divisor2 = "1";
		String divisor3 = "1";
		
		int max;
		
		if(num1 > num2) {
			max = num1;
		} else {
			max = num2;
		}
		
		for(int i=2; i<max; i++) {
			if(num1 % i == 0) {
				divisor1 += ", " + i;
			}
			
			if(num2 % i == 0) {
				divisor2 += ", " + i;
			}
			if(num1 % i == 0 && num2 % i == 0) {
				divisor3 += ", " + i;
			}
		}
		
		System.out.printf("%d의 약수 : %s%n", num1, divisor1);
		System.out.printf("%d의 약수 : %s%n", num2, divisor2);
		System.out.printf("%d와 %d의 공약수 : %s", num1, num2, divisor3);
	}

}
