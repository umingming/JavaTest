package com.test.question.array2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q10 {

	public static void main(String[] args) throws Exception{
		/*
		2	7	6
		9	5	1
		4	3	8
		
		설계>
		1. BufferedReader
		2. 배열의 길이 입력
		3. i = length-1, j = length/2
		4. for문 1 ~ length*length(요소의 개수)
			>if i,j 값이 범위 안? 아니면 i-=length, j+=length
			>if (i,j)에 값이 있는지?  
				>있으면 요소의 위치를 이전으로 이동 후 왼쪽으로 한 칸
				>아까 if문에서 값이 수정됐을 경우 다시 원래대로
			>조정이 끝난 (i,j)에 n값 저장
			>i--, j++(오른쪽 위 대각선 방향으로 위치 옮김)
		5. output 호출
		*/
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("배열의 길이 : ");
		int length = Integer.parseInt(reader.readLine());

		
		int[][] nums = new int[length][length];
		int i = length/2;
		int j = length-1;
		
		for(int n=1; n<=length*length; n++) {
			if(i < 0) {
				i += length;
			}
			if(j >= length) {
				j -= length;
			}
			
			if(nums[i][j] != 0) {
				i += 1;
				j -= 2;
				
				if(i >= length) {
					i -= length;
				}
				if(j < 0) {
					j += length;
				}
			}
			
			nums[i][j] = n;
			i--;
			j++;
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