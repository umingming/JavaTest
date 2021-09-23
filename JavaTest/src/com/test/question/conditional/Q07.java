package com.test.question.conditional;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q07 {

	public static void main(String[] args) throws Exception {
//		숫자 5개를 입력 받아 짝수와 홀수의 개수를 출력하시오.
		
//		설계>
//		1. 숫자 입력 메소드 생성
//			>BufferedReader
//			>입력 받은 값을 int로 리턴
//		2. 짝수 메소드 생성
//			>if문 > 입력값이 짝수면 even +1
//		3. 홀수 메소드 생성
//			>if문 > 입력값이 홀수면 odd +1
//		4. 총 홀/짝 개수 계산
//		5. 출력
//		*추가 조건 입력 받는 숫자를 한글로 바꾸시오.
//		1. 한글 입력 메소드 생성
//			>입력 받은 값을 switch문을 사용해 숫자로 변환
				
		int num1 = num();
		int num2 = num();
		int num3 = num();
		int num4 = num();
		int num5 = num();

		korNum(num1);
		korNum(num2);
		korNum(num3);
		korNum(num4);
		korNum(num5);

		int even= even(num1) + even(num2) + even(num3) + even(num4) + even(num5);
		int odd= odd(num1) + odd(num2) + odd(num3) + odd(num4) + odd(num5);
		
		System.out.printf("짝수는 %d개, 홀수는 %d개 입력했습니다.%n", even, odd);
		System.out.printf("홀수가 짝수보다 %d개 더 많습니다.%n", odd - even);

	}//main

	private static void korNum(int num){
		switch(num) {
		case 1 :
			System.out.println("1->하나");
			break;
		case 2 :
			System.out.println("2->둘");
			break;
		case 3 :
			System.out.println("3->셋");
			break;
		case 4 :
			System.out.println("4->넷");
			break;
		case 5 :
			System.out.println("5->다섯");
			break;
		case 6 :
			System.out.println("6->여섯");
			break;
		case 7 :
			System.out.println("7->일곱");
			break;
		case 8 :
			System.out.println("8->여덟");
			break;
		case 9 :
			System.out.println("9->아홉");
			break;
		case 10 :
			System.out.println("10->열");
			break;
		}
	}

	private static int odd(int num) {
		int odd = 0;
		if (num >= 1 && num <= 10 && num % 2 != 0) {
			++odd;
		}
		return odd;
	}//odd

	private static int even(int num) {
		int even = 0;
		if (num >= 1 && num <= 10 && num % 2 == 0) {
			++even;
		}
		return even;
	}//even

	private static int num() throws Exception{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("숫자 입력 : ");
		return Integer.parseInt(reader.readLine());
	}//inputNum

}
