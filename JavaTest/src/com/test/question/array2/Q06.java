package com.test.question.array2;

public class Q06 {

	public static void main(String[] args) {
		/*
		1	2	3	4	10
		5	6	7	8	26
		9	10	11	12	42
		13	14	15	16	58
		28	32	26	40	136

		설계>
		1. 5행 5열인 이차원 배열 선언
		2. n 변수 선언
		3. for문 0 ~ nums.length-2
			>for문 0 ~ nums[0].length-2
				>nums[i][nums[0].length-1]+=n
				>nums[nums.length-1][j]+=n
				>nums[nums.length-1][nums[0].length-1]+=n
				>n저장 후 ++
		4. output 호출
		*/
		
		int[][] nums = new int[5][5];
		int n = 1;
		
		for(int i=0; i<nums.length-1; i++) {
			for(int j=0; j<nums[0].length-1; j++) {
				nums[i][j] = n;
				nums[nums.length-1][j] += n;
				nums[i][nums[0].length-1] += n;
				nums[nums.length-1][nums[0].length-1] += n;
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