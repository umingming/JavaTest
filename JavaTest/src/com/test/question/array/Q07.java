package com.test.question.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q07 {

	public static void main(String[] args) throws Exception {
		/*
		배열에 요소를 삽입하시오.
		-배열의 시작 길이 : 10, 난수 대입
		
		설계>
		1. BufferedReader
		2. 삽입 위치와 값 입력
		3. array와 result 변수, 길이가 10인 배열 선언
		4. for문 10반복
			>배열에 난수저장
			>array += 난수
		5. for문 9~n
			>배열 값 한 칸씩 밀려 저장
		6. n번째 배열 값 수정
		7. for문 10
			>result + nums[i]
		9. 결과 출력, substring
		 */
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("삽입 위치 : ");
		int n = Integer.parseInt(reader.readLine());

		System.out.print("값 : ");
		int value = Integer.parseInt(reader.readLine());
		
		int[] nums = new int[10];
		int[] result = new int[10];
		
		for(int i=0; i<10; i++) {
			nums[i] = (int)(Math.random() * 100) + 1; //임의로 1~100 난수 선정
		}
		
		System.arraycopy(nums, 0, result, 0, n);
		result[n] = value;
		System.arraycopy(nums, n, result, n + 1, nums.length - n - 1);
		
		System.out.printf("원본 : %s%n", Arrays.toString(nums));
		
		nums = result;
		System.out.printf("결과 : %s%n", Arrays.toString(nums));
		
	}
}
