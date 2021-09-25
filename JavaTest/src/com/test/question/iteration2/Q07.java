package com.test.question.iteration2;

public class Q07 {

	public static void main(String[] args) {
		/*
		아래와 같이 출력하시오.
		1 ~  10 :   55
		1 ~  20 :  210
		...
		1 ~ 100 : 5050
		
		설계>
		1. sum 변수 선언
		2. for문 10 반복	
			>sum 0으로 초기화
			>for문 i*10반복해 j를 sum에 저장 
			>for문 1 ~ i*10 : sum 출력
		*/
		
		int sum;
		
		for(int i=1; i<=10; i++) {
			sum = 0;
		
			for(int j=1; j<=(i*10); j++) {
				sum += j;
			}
			
			System.out.printf("1 ~ %3d : %4d%n", i * 10, sum);
		}
	}
}
