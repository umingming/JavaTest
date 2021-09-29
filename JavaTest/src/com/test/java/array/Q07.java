package com.test.java.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q07 {

	public static void main(String[] args) throws Exception {
		/*
		배열에 요소를 삽입하시오.
		-배열의 시작 길이 : 10, 난수 대입
		
		설계>
		1. BufferedReader
		2. 삽입 위치와 값 입력
		3. 길이가 10인 배열 선언
		4. for문 10반복
			>배열에 난수저장
		5. 배열 출력
		6. for문 9~n
			>배열 값 한 칸씩 밀려 저장
		7. n번째 배열 값 수정
		8. 결과 출력
		 */
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("삽입 위치 : ");
		int insertIndex = Integer.parseInt(reader.readLine());

		System.out.print("값 : ");
		int value = Integer.parseInt(reader.readLine());
		
		int[] nums = new int[10];
		
		for(int i=0; i<nums.length; i++) {
			nums[i] = (int)(Math.random() * 100) + 1; //임의로 1~100 난수 선정
		}
		
		System.out.printf("원본 : %s%n", Arrays.toString(nums));
		
		for(int i=nums.length-2; i>insertIndex; i--) {
			nums[i] = nums[i-1];
		}
		
		nums[insertIndex] = value;
		System.out.printf("결과 : %s%n", Arrays.toString(nums));
	}
}
