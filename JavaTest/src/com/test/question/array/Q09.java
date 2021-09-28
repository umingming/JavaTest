package com.test.question.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q09 {

	public static void main(String[] args) throws Exception{
		/*
		난수로 채워진 배열에서 첫번째 방부터 연속으로 2개씩 더한 결과를 출력하시오.
		-난수 범위 1~100
		
		설계>
		1. BufferedReader
		2. 배열의 길이 입력
		3. int 배열 선언
		4. array, result 변수 선언
		5. for문
			>배열에 1~10 난수 저장
			>array에 추가
		6. for문 길이
			>if문 i % 2 != 0;
				>num[i] += num[i-1]
				>result 추가
		7. 결과 출력
		 */
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("배열의 길이 : ");
		int n = Integer.parseInt(reader.readLine());

		int[] nums = new int[n];
		String array = "", result = "";
		
		for(int i=0; i<n; i++) {
			nums[i] = (int)(Math.random() * 10) + 1;
			array += nums[i] + ", ";
		}

		for(int i=0; i<n; i++) {
			if(i % 2 != 0) {
				nums[i] += nums[i-1];
				result += nums[i] + ", ";
			} else if(i % 2 == 0 && i == (n-1)) {
				result += nums[i] + ", ";
			}
		}
		
		System.out.printf("원본 : [%s]%n", array.subSequence(0, array.lastIndexOf(",")));
		System.out.printf("결과 : [%s]%n", result.subSequence(0, result.lastIndexOf(",")));
	}

}
