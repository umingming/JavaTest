package com.test.question.array2;

public class Q08 {

	public static void main(String[] args) throws Exception {
		/*
		1	2	4	7	11
		3	5	8	12	16
		6	9	13	17	20
		10	14	18	21	23
		15	19	22	24	25

		설계>
		1. 5행 5열인 이차원 배열 선언
		2. n 변수 선언
		3. for문 0 ~ nums[0].length-1
			>for문 0 ~ j
				>nums[i][j-i]+=n
				>n저장 후 ++
		4. for문 1~ nums.length
			>for문 0 ~ nums[0].length-i
				>nums[i+j][nums[0].length-j-1]+=n
				>n저장 후 ++
		5. output 호출
		*/
		
		int[][] nums = new int[5][5];
		int n = 1;
		
		for(int j=0; j<nums[0].length; j++) {
			for(int i=0; i<=j; i++) {
				nums[i][j-i] = n;
				n++;
			}
		}
		
		for(int i=1; i<nums.length; i++) {   
			for(int j=0; j<nums[0].length-i; j++) {
				nums[i+j][nums[0].length-j-1] = n;
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