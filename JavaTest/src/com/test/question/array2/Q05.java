package com.test.question.array2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q05 {

	public static void main(String[] args) throws Exception {
		/*
		0	0	1	0	0
		0	2	3	4	0
		5	6	7	8	9
		0	10	11	12	0
		0	0	13	0	0

		설계>
		1. BufferedReader
		2. 행, 열 입력 받음 
		3. 입력 받은 데이터로 이차원 배열 선언
		2. n 변수 선언
		3. for문 0 ~ nums.length-1
			>if문 i<=2?
				>for문 2+i ~ i+2
					>n저장 후 ++
				>for문 i-2 ~ 6-i
					>n저장 후 ++
		4. output 호출
		*/
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("행의 길이 : ");
		int row = Integer.parseInt(reader.readLine());

		System.out.print("열의 길이 : ");
		int col = Integer.parseInt(reader.readLine());
		
		int[][] nums = new int[row][col];
		int n = 1;
		
		for(int i=0; i<nums.length; i++) {
			if(i <= nums.length/2) {
				for(int j=nums[0].length/2-i; j<=i+nums[0].length/2; j++) {
					nums[i][j] = n;
					n++;
				}
				
			} else {
				for(int j=nums[0].length/2-i; j<=6; j++) {
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