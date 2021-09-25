package com.test.question.iteration2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q05 {

	public static void main(String[] args) throws Exception{
		/*
		아래와 같이 출력하시오.
		  aa
	 	 abba
	    abccba -행의 갯수 입력 받기
	    
	    설계>
	    1. BufferedReader
	    2. 행의 갯수 입력 받기
	    3. for문 line만큼 반복
	    	>for문 공백 (line-i) 출력
	    	>for문 알파벳 출력	>97+j 반복 출력; i=0: a, i=1: ab ...
	    	>for문 알파벳 출력	>97+i-j 반복 출력; i=0	: a, i=1: ba ...			
		 */
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("행의 갯수 : ");
		int line = Integer.parseInt(reader.readLine());
		
		for(int i=0; i<line; i++) {
			for(int j=0; j<line-i-1; j++) {
				System.out.print(" ");
			}
			
			for(int j=0; j<=i; j++) {
				System.out.printf("%c", 97+j);
			}
			
			for(int j=0; j<=i; j++) {
				System.out.printf("%c", 97+i-j);
			}
			
			System.out.println();
		}
		
		
	}

}
