package com.test.question.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q09 {

	public static void main(String[] args) throws Exception{
		/*
		난수로 채워진 배열에서 첫번째 방부터 연속으로 2개씩 더한 결과를 출력하시오.
		-난수 범위 1~100
		
		설계>
		1. BufferedReader
		2. 배열의 길이 입력
		3. int 배열 선언
		4. for문
			>배열에 1~10 난수 저장
		6. for문 길이
			>if문 i % 2 != 0?
				>num[마지막 값] 저장
				>num[2*i] + num[2*i+1] 저장
		7. 결과 출력
		 */
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("배열의 길이 : ");
		int n = Integer.parseInt(reader.readLine());

		int[] nums = new int[n];
		int[] result = new int[(int)Math.ceil(n / 2.0)];
		
		for(int i=0; i<n; i++) {
			nums[i] = (int)(Math.random() * 10) + 1;
		}

		for(int i=0; i<result.length; i++) {
			if(n % 2 != 0 && i == (result. length - 1)) {
				result[i] = nums[n - 1];
			} else {
				result[i] += nums[2*i] + nums[2*i+1];
			}
		}
		
		System.out.println(Arrays.toString(nums));
		System.out.println(Arrays.toString(result));
	}

}
