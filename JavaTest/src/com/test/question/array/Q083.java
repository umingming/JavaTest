package com.test.question.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q083 {

	public static void main(String[] args) throws Exception {
		/*
		배열에 요소를 삭제하시오.
		-배열의 길이 5, 난수 대입
		
		설계>
		1. BufferedReader
		2. 삭제 위치 입력 받음
		3. 길이가 5인 배열 선언
		4. array, result 변수 선언
		5. for문 5
			>배열에 난수 대입
			>array += nums
		6. for문 n이후
			>if문 i가 마지막인지?
				>배열 한 칸씩 당겨서 저장, 마지막이면 0
		7. for문 5
			>result += nums
		8. 결과 출력
		 */

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("삭제 위치 : ");
		int n = Integer.parseInt(reader.readLine());

		int[] nums = new int[5];
		String array = "", result = "";
		
		for(int i=0; i<5; i++) {
			nums[i] = (int)(Math.random() * 10) + 1;
			array += nums[i] + ", ";
		}
		
		for(int i=n; i<5; i++) {
			if(i != 4) {
				nums[i] = nums[i+1];
			} else {
				nums[i] = 0;
			}
		}
			
		for(int i=0; i<5; i++) {
			result += nums[i] + ", ";
		}
		
		System.out.printf("원본 : %s%n", array.substring(0, array.lastIndexOf(",")));
		System.out.printf("결과 : %s%n", result.substring(0, result.lastIndexOf(",")));
		
	}

}
