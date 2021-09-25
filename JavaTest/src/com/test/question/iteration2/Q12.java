package com.test.question.iteration2;

public class Q12 {

	public static void main(String[] args) {
		/*
		6 = [1, 2, 3]
		28 = [1, 2, 4, 7, 14]
		1부터 100사이의 완전수를 구하시오.
		
		설계>
		1. sum, divisor 변수 선언
		2. for문 100반복
			>divisor, sum 초기화
			>for문 i 전까지 반복
				>if문(i % j == 0) >divisor, sum += j
			>if문(sum = i) >divisor 출력
		 */
		
		int sum;
		String divisor;
		
		for(int i=2; i<100; i++) {
			sum = 1;
			divisor = "1";
			
			for(int j=2; j<i; j++) {
				if(i % j == 0) {
					sum += j;
					divisor += ", " + j;
				}
			}
			
			if(sum == i) {
				System.out.printf("%2d = [%s]%n", i, divisor);
			}
		}
	}
}
