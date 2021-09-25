package com.test.question.iteration2;

public class Q08 {

	public static void main(String[] args) {
		/*
		아래와 같이 출력하시오.
		1 ~  10 :   55
		...
		91 ~ 100 : 955

		설계>
		1. sum 변수 선언
		2. for문 10 반복
			>sum 0으로 초기화
			>for문 i*10+1 부터 i*10+10까지 반복한 값을 sum에 저장
			>결과 출력
		*/
		
		int sum;
		
		for(int i=0; i<10; i++) {
			sum = 0;
			
			for(int j=(i*10+1); j<=(i*10+10); j++) {
				sum += j;
			}
			
			System.out.printf("%2d ~ %3d : %3d%n", 
					i * 10 + 1, i * 10 + 10, sum);
		}

	}

}
