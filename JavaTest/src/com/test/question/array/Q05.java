package com.test.question.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q05 {

	public static void main(String[] args) throws Exception{
		/*
		난수를 담고 있는 배열을 생성한 뒤 아래와 같이 출력하시오.
		-1~20 사이 난수를 20개 만들어 범위에 만족하는 값만 출력함
		
		설계>
		1. BufferedReader
		2. 최대, 최소 범위 입력
		3. 길이가 20인 배열 선언
		4. 원본과 result 변수 선언
		5. for문 20
			>배열에 난수 저장
			>array에 난수 추가
			>if문 범위 안의 값인지?
				>맞으면 result에 추가
		6. 결과 출력, substring	
		 */
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("최대 범위 : ");
		int max = Integer.parseInt(reader.readLine());
		System.out.print("최소 범위 : ");
		int min = Integer.parseInt(reader.readLine());

		int[] nums = new int[20];
		String array = "", result = "";
		
		for(int i=0; i<20; i++) {
			nums[i] = (int)(Math.random() * 20) + 1;
			array += nums[i] + ", ";
			
			if(nums[i] >= min && nums[i] <= max) {
				result += nums[i] + ", ";
			}
		}
		
		System.out.printf("원본 : %s%n", array.substring(0,array.lastIndexOf(",")));
		System.out.printf("결과 : %s%n", result.substring(0,result.lastIndexOf(",")));
	}

}
