package com.test.java.collection;

import java.util.Arrays;

public class Bubble {

	public static void main(String[] args) {
		m1();
	}

	private static void m1() {
		/*
		배열을 오름차순으로 정렬해주는 버블 정렬을 만들어 보자.
		
		설계>
		1. int 배열 선언 후 랜덤 숫자로 초기화
		2. for문 배열의 길이 -1 반복
			>for문 배열의 길이 -1 -i 반복
				>j번째 요소가 j+1보다 큰지?
					>temp 변수 선언 후 j+1저장
					>j+1에 j 요소 저장
					>j에는 temp 값 저장
		3. 배열 출력해서 확인
		 */
		
		int[] nums =  {3, 2, 1, 4, 5};
		for(int i=0; i<nums.length-1; i++) {
			for(int j=0; j<nums.length-1-i; j++) {
				if(nums[j] > nums[j+1]) {
					int temp = nums[j+1];
					nums[j+1] = nums[j];
					nums[j] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(nums));
		
	}

}
