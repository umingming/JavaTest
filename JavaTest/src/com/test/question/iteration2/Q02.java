package com.test.question.iteration2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;

public class Q02 {

	public static void main(String[] args) throws Exception{
		/*
		   *
		  **
		 ***
		****
		-행의 갯수를 입력 받으시오
		
		설계>
		1. BufferedReader 사용
		2. 행의 갯수 입력 받기
		3. for문 행만큼 반복
			>for문 line-i만큼 반복 공백 출력
			>for문 i만큼 반복 별 출력
		 */
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("행의 갯수 : ");
		int line = Integer.parseInt(reader.readLine());
		
		for(int i=0; i<line; i++) {
			for(int j=0; j<(line-i-1); j++) {
				System.out.print(" ");
			}
			
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}

	}

}
