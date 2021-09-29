package com.test.question.array2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q07 {

	public static void main(String[] args) throws Exception {
		/*
		-String[][] score = new String[10][3];

		설계>
		1. 10행 3열인 이차원 배열 선언
		2. 길이가 3인 int 배열 선언
		3. BufferedReader
		4. 점수를 배열에 저장
		3. for문 0 ~ nums[0].length-1
			>for문 nums.legnth-1 ~ 0
				>if(score[j] > 0) ? ■ 저장
				> score[j] -= 10
		4. output 호출
		*/
		
		String[][] scores = new String[10][3];
		int[] subjects = new int [3];
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("국어점수 : ");
		subjects[0] = Integer.parseInt(reader.readLine());

		System.out.print("영어점수 : ");
		subjects[1] = Integer.parseInt(reader.readLine());
		
		System.out.print("수학점수 : ");
		subjects[2] = Integer.parseInt(reader.readLine());
		
		for(int j=0; j<scores[0].length; j++) {
			for(int i=scores.length-1; i>=0; i--) {
				
				if(subjects[j] > 0) {
					scores[i][j] = "■";
				} else {
					scores[i][j] = "";
				}

				subjects[j] -= 10;
			}
		}
		
		output(scores);
		System.out.println();
		System.out.println("국어 영어 수학");
	}

	private static void output(String[][] nums) {
		for(int i=0; i<nums.length; i++) {
			for(int j=0; j<nums[0].length; j++) {
				System.out.printf("%3s", nums[i][j]);
			}
			System.out.println();
		}
	}

}