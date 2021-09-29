package com.test.question.array2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q08 {

	public static void main(String[] args) throws Exception {
		/*
		1	2	4	7	11
		3	5	8	12	16
		6	9	13	17	20
		10	14	18	21	23
		15	19	22	24	25

		설계>
		1. BufferedReader
		2. 행, 열 입력 받음 
		3. 입력 받은 데이터로 이차원 배열 선언
		4. n 변수 선언
		5. for문 0 ~ nums[0].length-1
			>for문 0 ~ j
				>nums[i][j-i]+=n
				>n저장 후 ++
		6. for문 1~ nums.length
			>for문 0 ~ nums[0].length-i
				>nums[i+j][nums[0].length-j-1]+=n
				>n저장 후 ++
		7. output 호출
		*/
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("행의 길이 : ");
		int row = Integer.parseInt(reader.readLine());

		System.out.print("열의 길이 : ");
		int col = Integer.parseInt(reader.readLine());
		
		int[][] nums = new int[row][col];
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