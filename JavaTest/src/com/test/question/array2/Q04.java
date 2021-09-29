package com.test.question.array2;

public class Q04 {

	public static void main(String[] args) {
		/*
		1	2	3	4	5
		6	7	8	9	0
		10	11	12	0	0
		13	14	0	0	0
		15	0	0	0	0
		
		설계>
		1. 길이가 5인 이차원 배열 선언
		2. n 변수 선언
		3. for문 0 ~ nums.length
			>for문 0 ~ nums[0].length-i
				>n값 저장
				>n++	
		4. output 호출
		*/
		
		int[][] nums = new int[5][5];
		int n = 1;
		
		for(int i=0; i<nums.length; i++) {
			for(int j=0; j<nums[0].length-i; j++) {
				nums[i][j] = n;
				n++;
			}
		}
		
		output(nums);
	}

	private static void output(int[][] nums) {
		for(int i=0; i<nums.length; i++) {
			for(int j=0; j<nums[0].length; j++) {
				System.out.printf("%3d", nums[i][j]);
			}
			System.out.println();
		}
	}

}