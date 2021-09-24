package com.test.question.iteration2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q01 {

	public static void main(String[] args) throws Exception{
		/* 
		별 찍기
		-행의 갯수를 입력 받으시오
		
		설계>
		1. BufferedReader 사용
		2. 행의 갯수 입력 받기
		3. for문(int i=0; i<행; i++)
			>for문 ; 공백 출력
			>for문 ; *출력
		 */
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("행의 갯수 : ");
		int line = Integer.parseInt(reader.readLine());
		
		for(int i=0; i<line; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<line-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
