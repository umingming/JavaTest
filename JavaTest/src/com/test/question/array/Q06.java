package com.test.question.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q06 {

	public static void main(String[] args) throws Exception{
		/*
		중복되지 않는 임의의 숫자를 만드시오.
		-숫자의 범위와 갯수를 입력 받으시오.
		
		설계>
		1. BufferedReader
		2. 최대, 최소, 개수 입력
		3. 개수를 길이로 하는 int 배열 선언
		4. for문 배열 길이 반복
			>난수 저장
			>for문 무한루프
				>중복 변수 선언
				>for문 i반복
				>if문 num[i]가 num[j]와 같은지 확인
					>같으면 중복 ++
				>중복이 0이면 break
				>난수 재저장
		5. 출력
		 */
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("최대 값 : ");
		int max = Integer.parseInt(reader.readLine());

		System.out.print("최소 값 : ");
		int min = Integer.parseInt(reader.readLine());
		
		System.out.print("개수 : ");
		int n = Integer.parseInt(reader.readLine());

		int[] nums = new int[n];
		
		for(int i=0; i<n; i++) {
			nums[i] = (int)(Math.random() * (max - min + 1)) + min;
			
			for(;;) {
				int overlap = 0;
				for(int j=0; j<i; j++) {
					if(nums[i] == nums[j]) {
						overlap++;
					}
				}
				
				if(overlap == 0) {
					break;
				}
				
				nums[i] = (int)(Math.random() * (max - min + 1)) + min;
			}
		}
		
		System.out.println(Arrays.toString(nums));
	}

}
