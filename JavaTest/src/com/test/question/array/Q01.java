package com.test.question.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q01 {

	public static void main(String[] args) throws Exception{
		/*
		숫자 5개를 입력 받아 배열에 담은 뒤 역순으로 출력하시오.
		
		설계>
		1. BufferedReader
		2. 길이가 5인 int 배열 생성
		3. for문 배열의 길이만큼
			>숫자 입력
			>배열에 저장
		4. for문 배열의 길이만큼
			>길이-i를 인덱서로 출력
		 */
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int[] nums = new int[5];
		
		for(int i=0; i<5; i++) {
			System.out.print("숫자 : ");
			nums[i] = Integer.parseInt(reader.readLine());
		}
		
		for(int i=0; i<5; i++) {
			System.out.printf("nums[%d] = %d%n", 4-i, nums[4-i]);
		}
	}
}
