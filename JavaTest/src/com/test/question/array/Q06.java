package com.test.question.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q06 {

	public static void main(String[] args) throws Exception{
		/*
		중복되지 않는 임의의 숫자를 만드시오.
		-숫자의 범위와 갯수를 입력 받으시오.
		
		설계>
		1. BufferedReader
		2. 최대, 최소, 개수 입력
		3. 개수를 길이로 하는 int 배열 선언
		4. result 변수 선언
		5. for문 배열 길이 반복
			>for문 무한 루프
				>난수 저장
				>if문 범위면 break
			>for문 i 반복
				>if문 num[i]가 num[j]와 같은지 확인
					>for문 무한루프 안 같을 때까지 변수 저장
			>result에 추가
		6. result substring 사용해 출력
		 */
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("최대 값 : ");
		int max = Integer.parseInt(reader.readLine());

		System.out.print("최소 값 : ");
		int min = Integer.parseInt(reader.readLine());
		
		System.out.print("개수 : ");
		int n = Integer.parseInt(reader.readLine());

		int[] nums = new int[n];
		String result = "";
		
		for(int i=0; i<n; i++) {
			for(;;) {
				nums[i] = (int)(Math.random() * 20) + 1;
				
				if(nums[i] >= min && nums[i] <= max) {
					break;
				}
			}
			
			for(int j=0; j<i; j++) {
				if(nums[i] == nums[j]) {
					for(;;) {
						nums[i] = (int)(Math.random() * 20) + 1;
						
						if(nums[i] >= min && nums[i] <= max && nums[i] != nums[j]) {
							break;
						}
					}
				}
			}
			
			result += nums[i] + ", ";
		}
		
		result = result.substring(0, result.lastIndexOf(","));
		System.out.println("[" + result +"]");
	}

}
