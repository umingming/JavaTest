package com.test.question.iteration2;

public class Q09 {

	public static void main(String[] args) {
		/*
		아래와 같이 출력하시오.
		1 + 2 + 4 + 7 + ... + N = 469
		-N < 100
		
		설계>
		1. process, sum 변수 선언
		2. for문 i++ 무한루프
			>add 변수 선언 후 1로 초기화
			>for문 j는 i까지 반복	>add += j
			>if문 (add > 100) >break
			>process, sum += add
		3. 결과 출력
		 */
		
		int sum = 1;
		String process = "1";
		
		for(int i=1; ; i++) {
			int add = 1;
			
			for(int j=1; j<=i; j++) {
				add += j;
			}
			
			if(add > 100) {
				break;
			}
			
			process += " + " + add;
			sum += add;
		}
		System.out.println(process + " = " + sum);
	}//main

}
