package com.test.question.array2;

public class Q05 {

	public static void main(String[] args) {
		/*
		0	0	1	0	0
		0	2	3	4	0
		5	6	7	8	9
		0	10	11	12	0
		0	0	13	0	0

		설계>
		1. 5행 5열인 이차원 배열 선언
		2. n 변수 선언
		3. for문 0 ~ nums.length-1
			>if문 i<=2?
				>for문 2+i ~ i+2
					>n저장 후 ++
				>for문 i-2 ~ 6-i
					>n저장 후 ++
		4. output 호출
		*/
		
		int[][] nums = new int[5][5];
		int n = 1;
		
		for(int i=0; i<nums.length; i++) {
			if(i <= 2) {
				for(int j=2-i; j<=i+2; j++) {
					nums[i][j] = n;
					n++;
				}
				
			} else {
				for(int j=i-2; j<=6-i; j++) {
					nums[i][j] = n;
					n++;
				}
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