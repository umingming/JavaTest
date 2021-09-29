package com.test.question.array2;

public class Q093 {

	public static void main(String[] args) {
		/*
		1	2	3	4	5
		16	17	18	19	6
		15	24	25	20	7
		14	23	22	21	8
		13	12	11	10	9
		
		설계>
		1. 5행 5열인 이차원 배열 선언
		2. n, i, j 변수 선언
		3. for문
			>1행(오)->5열(아)->5행(왼)->1열(위)->2행(오)->4열(아)->4행(왼)->2열(위)->3행(오)
		4. output 호출
		*/
		
		int[][] nums = new int[7][7];
		int n = 1, i = 0, j = 0;
		
		for(j=0; j<nums[0].length; j++) {
			nums[i][j] = n;
			n++;
		}
		j -= 1;
		
		for(i=1; i<nums.length; i++) {
			nums[i][j] = n;
			n++;
		}
		i -= 1;
		
		for(j=j-1; j>=0; j--) {
			nums[i][j] = n;
			n++;
		}
		j += 1;
		
		for(i=i-1; i>0; i--) {
			nums[i][j] = n;
			n++;
		}
		i += 1;
		
		for(j=j+1; j<nums[0].length-1; j++) {
			nums[i][j] = n;
			n++;
		}
		j -= 1;
		
		for(i=i+1; i<nums.length-1; i++) {
			nums[i][j] = n;
			n++;
		}
		i -= 1;
		
		for(j=j-1; j>0; j--) {
			nums[i][j] = n;
			n++;
		}
		j += 1;
		
		for(i=i-1; i>1; i--) {
			nums[i][j] = n;
			n++;
		}
		i += 1;
		
		for(j=i; j<nums[0].length-2; j++) {
			nums[i][j] = n;
			n++;
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
