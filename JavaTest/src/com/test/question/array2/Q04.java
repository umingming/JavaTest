package com.test.question.array2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q04 {

	public static void main(String[] args) throws Exception{
		/*
		1	2	3	4	5
		6	7	8	9	0
		10	11	12	0	0
		13	14	0	0	0
		15	0	0	0	0
		
		설계>
		1. BufferedReader
		2. 행, 열 입력 받음 
		3. 입력 받은 데이터로 이차원 배열 선언
		4. n 변수 선언
		5. for문 0 ~ nums.length
			>for문 0 ~ nums[0].length-i
				>n값 저장
				>n++	
		6. output 호출
		*/
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("행의 길이 : ");
		int row = Integer.parseInt(reader.readLine());

		System.out.print("열의 길이 : ");
		int col = Integer.parseInt(reader.readLine());
		
		int[][] nums = new int[row][col];
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