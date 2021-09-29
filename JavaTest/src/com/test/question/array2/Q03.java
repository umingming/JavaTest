package com.test.question.array2;

public class Q03 {

	public static void main(String[] args) {
		/*
		1	6	11	16	21
		2	7	12	17	22
		3	8	13	18	23
		4	9	14	19	24
		5	10	15	20	25

		설계>
		1. 5행 5열인 5인 이차원 배열 선언
		2. n 변수 선언
		3. for문 0 ~ nums[0].length
			>for문 0 ~ nums.length
				>n값 저장
				>n++	
		4. output 호출
		*/
		
		int[][] nums = new int[5][5];
		int n = 1;
		
		for(int j=0; j<nums[0].length; j++) {
			for(int i=0; i<nums.length; i++) {
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