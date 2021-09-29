package com.test.question.array2;

public class Q01 {

	public static void main(String[] args) {
		/*
		1	2	3	4	5
		10	9	8	7	6
		11	12	13	14	15
		20	19	18	17	16
		21	22	23	24	25
		
		설계>
		1. 5행 5열인 이차원 배열 선언
		2. n 변수 선언
		3. for문 nums.length
			> i % 2 == 0; 
				>for문 맞으면 ->, 아니면 <- 방향으로 n값 저장
				>n++
		4. output 호출
		*/
		
		int[][] nums = new int[5][5];
		int n = 1;
		
		for(int i=0; i<nums.length; i++) {
			if(i % 2 == 0) {
				for(int j=0; j<nums[0].length; j++) {
					nums[i][j] = n;
					n++;
				}
			} else {
				for(int j=nums[0].length-1; j>=0; j--) {
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