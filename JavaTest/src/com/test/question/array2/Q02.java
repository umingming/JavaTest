package com.test.question.array2;

public class Q02 {

	public static void main(String[] args) {
		/*
		25	24	23	22	21
		20	19	18	17	16
		15	14	13	12	11
		10	9	8	7	6
		5	4	3	2	1

		설계>
		1. 길이가 5인 이차원 배열 선언
		2. n 변수 선언
		3. for문 nums.length-1 ~ 0
			>for문 nums[0].length-1 ~ 0
				>n값 저장
				>n++	
		4. output 호출
		*/
		
		int[][] nums = new int[5][5];
		int n = 1;
		
		for(int i=nums.length-1; i>=0; i--) {
			for(int j=nums[0].length-1; j>=0; j--) {
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