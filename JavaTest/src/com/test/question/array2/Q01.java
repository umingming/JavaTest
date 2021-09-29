package com.test.question.array2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q01 {

	public static void main(String[] args) throws Exception {
		/*
		1	2	3	4	5
		10	9	8	7	6
		11	12	13	14	15
		20	19	18	17	16
		21	22	23	24	25
		
		설계>
		1. BufferedReader
		2. 행, 열 입력 받음 
		3. 입력 받은 데이터로 이차원 배열 선언
		4. n 변수 선언
		5. for문 nums.length
			> i % 2 == 0; 
				>for문 맞으면 ->, 아니면 <- 방향으로 n값 저장
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