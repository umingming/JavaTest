package com.test.question.iteration2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q03 {

	public static void main(String[] args) throws Exception{
		/*
		아래와 같이 출력하시오.
		  *
		 ***
		***** -행의 갯수 입력 받으시오.
		
		설계>
		1. BufferedReader
		2. 행의 갯수 입력 받기
		3. for문 행 반복
			>for문 행-i 반복 공백 출력
			>forans 2*i+1 반복 * 출력
		 */
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("행의 갯수 : ");
		int line = Integer.parseInt(reader.readLine());
		for(int i=0; i<line; i++) {
			for(int j=0; j<line-i-1; j++) {
				System.out.printf(" ");
			}
			
			for(int j=0; j<2*i+1; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
