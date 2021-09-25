package com.test.question.iteration2;

public class Q06 {

	public static void main(String[] args) {
		/*
		아래와 같이 출력하시오.
		2 x 1 =  2  3 x 1 =  3  4 x 1 =  4  5 x 1 =  5
		...
		2 x 9 = 18  3 x 9 = 27  4 x 9 = 36  5 x 9 = 45
		
		6 x 1 =  6  7 x 1 =  7  8 x 1 =  8  9 x 1 =  9
		...
		6 x 9 = 54  7 x 9 = 63  8 x 9 = 72  9 x 9 = 81
		
		설계> 
		1. for문 9만큼 반복
			>for문 j(2~5) 반복해서 j x i형태로 구구단 출력
		2. for문 9만큼 반복
			>for문 j(6~9) 반복해서 j x i형태로 구구단 출력
		*/
		
		for(int i=1; i<10; i++) {
			for(int j=2; j<6; j++) {
				System.out.printf("%d x %d = %2d\t", j, i, j * i);
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=1; i<10; i++) {
			for(int j=6; j<10; j++) {
				System.out.printf("%d x %d = %2d\t", j, i, j * i);
			}
			System.out.println();
		}
	}
}
