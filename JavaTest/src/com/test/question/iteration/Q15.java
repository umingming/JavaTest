package com.test.question.iteration;

public class Q15 {

	public static void main(String[] args) {
		/*
		1 + 2 + 4 + 7 + 11 + 16 + N = 469
			
		설계>
		1. sum, add, process 변수 선언
		2. for문
			> add가 1씩 증가함
			> sum에 add를 더함
		*/
		
		int sum = 0;
		int add = 0;
		String process = "";
		
		for(int i=1; ; i++) {
			add = i;
			sum += add;
			process += i;
		}
		

	}

}
