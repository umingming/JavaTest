package com.test.question.iteration2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q04 {

	public static void main(String[] args) throws Exception{
		/*
		*
		 *
		  *
		-행의 갯수 입력 받기
		
		설계>
		1. BufferedReader
		2. 행의 갯수 입력 받기
		3. for문 입력한 수만큼 반복 
			>for문 i보다 하나 적게 공백 반복 출력
			>별 출력
		 */
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("행의 개수 : ");
		int line = Integer.parseInt(reader.readLine());
		
		for(int i=0; i<line; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}
	}

}
