package com.test.question.array;

public class Q04 {

	public static void main(String[] args) {
		/*
		1~20 사이의 난수를 답고 있는 배열을 생성하고 최대값과 최소값을 출력하시오.
		-난수를 20개 발생 후 배열에 넣는다
		
		설계>
		1. 길이가 20인 int 배열 선언
		2. 최대, 최소, 원본 변수 선언
		3. for문 배열의 길이
			>i에 난수 저장
			>if문 최소, 최대 비교 
				>해당 수가 배열 중 가장 크거나 가장 작으면 최대, 최소 변수에 저장
		4.결과 출력 원본의 경우 substring사용
		 */
		
		int[] nums = new int[20];
		
		int min = 20, max = 1;
		String array = "";
		
		for(int i=0; i<20; i++) {
			nums[i] = (int)(Math.random() * 20) + 1;
			if (min > nums[i]) {
				min = nums[i];
			}
			if (max < nums[i]) {
				max = nums[i];
			}
			
			array += nums[i] + ", ";
		}
		System.out.printf("원본 : %s%n", array.substring(0, array.lastIndexOf(",")));
		System.out.printf("최대값 : %d%n", max);
		System.out.printf("최소값 : %d%n", min);

	}

}
