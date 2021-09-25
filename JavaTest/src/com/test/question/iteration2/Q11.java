package com.test.question.iteration2;

public class Q11 {

	public static void main(String[] args) {
		/*
		2부터 100사이의 소수를 구하시오.
		
		설게>
		1. divisor 변수 선언
		2. for문 100 반복
			>divisor 변수 0 초기화
			>for문 i만큼 반복
				>if문 (i % j == 0) >divisor++;
			>if문 (divisor == 2) >i출력
		 */
		
		int divisor;
		
		System.out.print("2");
		
		for(int i=3; i<=100; i++) {
			divisor = 0;
			for(int j=1; j<=i; j++) {
				if(i % j == 0) {
					divisor++;
				}
			}
			
			if(divisor == 2) {
				System.out.print(", " + i);
			}
		}
	}

}
